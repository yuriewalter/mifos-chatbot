package org.mifos.chatbot.protocol.slack;

import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.SlackUser;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import lombok.extern.slf4j.Slf4j;
import org.mifos.chatbot.core.AdapterService;
import org.mifos.chatbot.core.ChatService;
import org.mifos.chatbot.core.model.Message;
import org.mifos.chatbot.core.model.MifosResponse;
import org.mifos.chatbot.core.model.MifosSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SlackChatService implements ChatService {

    @Autowired
    private SlackSession session;

    private ChatCallBack callback;

    @Autowired
    private MifosSettings settings;

    @Autowired
    private AdapterService adapterService;

    public SlackChatService() {

    }

    public SlackChatService(SlackSession session) {
        this.session = session;
    }

    @Override
    public void connect(ChatCallBack chatCallBack) {
        try {
            session.connect();
            session.addMessagePostedListener(new SlackMessagePostedListener() {
                @Override
                public void onEvent(SlackMessagePosted event, SlackSession session) {
                    if(callback!=null) {
                        Message m = new Message();
                        m.setFrom(event.getSender().getId());
                        m.setText(event.getMessageContent());

                        callback.onMessage(m);
                    }

                    List<MifosResponse> responseList = adapterService.handle(event.getMessageContent());
                    for(MifosResponse response : responseList) {
                        Message msg = new Message();
                        msg.setText(response.getContent());
                        msg.setTo("zhaodingfanhaha@gmail.com");
                        send(msg);
                    }
                }
            });
        } catch (Exception e) {
            log.error(e.toString(), e);
        }
    }

    @Override
    public void disconnect() {
        try {
            session.disconnect();
        } catch (Exception e) {
            log.error(e.toString(), e);
        }
    }

    @Override
    public void send(Message msg) {
        SlackUser user = session.findUserByEmail(msg.getTo());
        session.sendMessageToUser(user, msg.getText(), null);
    }
}
