/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.api;

import com.google.gson.reflect.TypeToken;
import org.mifos.chatbot.client.*;
import org.mifos.chatbot.client.model.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountingClosureApi {
    private ApiClient apiClient;

    public AccountingClosureApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountingClosureApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createGLClosure
     * @param body Request Body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createGLClosureCall(PostGLCLosuresRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/glclosures";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createGLClosureValidateBeforeCall(PostGLCLosuresRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createGLClosure(Async)");
        }
        

        com.squareup.okhttp.Call call = createGLClosureCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     * @param body Request Body (required)
     * @return PostGlClosuresResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostGlClosuresResponse createGLClosure(PostGLCLosuresRequest body) throws ApiException {
        ApiResponse<PostGlClosuresResponse> resp = createGLClosureWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     * @param body Request Body (required)
     * @return ApiResponse&lt;PostGlClosuresResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostGlClosuresResponse> createGLClosureWithHttpInfo(PostGLCLosuresRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createGLClosureValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PostGlClosuresResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an Accounting Closure (asynchronously)
     * Mandatory Fields officeId,closingDate
     * @param body Request Body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createGLClosureAsync(PostGLCLosuresRequest body, final ApiCallback<PostGlClosuresResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createGLClosureValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostGlClosuresResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteGLClosure
     * @param glClosureId glclosureId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteGLClosureCall(Long glClosureId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/glclosures/{glClosureId}"
            .replaceAll("\\{" + "glClosureId" + "\\}", apiClient.escapeString(glClosureId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteGLClosureValidateBeforeCall(Long glClosureId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'glClosureId' is set
        if (glClosureId == null) {
            throw new ApiException("Missing the required parameter 'glClosureId' when calling deleteGLClosure(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteGLClosureCall(glClosureId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * @param glClosureId glclosureId (required)
     * @return DeleteGlClosuresResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteGlClosuresResponse deleteGLClosure(Long glClosureId) throws ApiException {
        ApiResponse<DeleteGlClosuresResponse> resp = deleteGLClosureWithHttpInfo(glClosureId);
        return resp.getData();
    }

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * @param glClosureId glclosureId (required)
     * @return ApiResponse&lt;DeleteGlClosuresResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteGlClosuresResponse> deleteGLClosureWithHttpInfo(Long glClosureId) throws ApiException {
        com.squareup.okhttp.Call call = deleteGLClosureValidateBeforeCall(glClosureId, null, null);
        Type localVarReturnType = new TypeToken<DeleteGlClosuresResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an accounting closure (asynchronously)
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * @param glClosureId glclosureId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteGLClosureAsync(Long glClosureId, final ApiCallback<DeleteGlClosuresResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteGLClosureValidateBeforeCall(glClosureId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteGlClosuresResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retreiveClosure
     * @param glClosureId glClosureId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retreiveClosureCall(Long glClosureId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/glclosures/{glClosureId}"
            .replaceAll("\\{" + "glClosureId" + "\\}", apiClient.escapeString(glClosureId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retreiveClosureValidateBeforeCall(Long glClosureId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'glClosureId' is set
        if (glClosureId == null) {
            throw new ApiException("Missing the required parameter 'glClosureId' when calling retreiveClosure(Async)");
        }
        

        com.squareup.okhttp.Call call = retreiveClosureCall(glClosureId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * @param glClosureId glClosureId (required)
     * @return GetGLClosureResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetGLClosureResponse retreiveClosure(Long glClosureId) throws ApiException {
        ApiResponse<GetGLClosureResponse> resp = retreiveClosureWithHttpInfo(glClosureId);
        return resp.getData();
    }

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * @param glClosureId glClosureId (required)
     * @return ApiResponse&lt;GetGLClosureResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetGLClosureResponse> retreiveClosureWithHttpInfo(Long glClosureId) throws ApiException {
        com.squareup.okhttp.Call call = retreiveClosureValidateBeforeCall(glClosureId, null, null);
        Type localVarReturnType = new TypeToken<GetGLClosureResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an Accounting Closure (asynchronously)
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * @param glClosureId glClosureId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retreiveClosureAsync(Long glClosureId, final ApiCallback<GetGLClosureResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retreiveClosureValidateBeforeCall(glClosureId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetGLClosureResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveAllClosures
     * @param officeId officeId (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAllClosuresCall(Long officeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/glclosures";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (officeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("officeId", officeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveAllClosuresValidateBeforeCall(Long officeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = retrieveAllClosuresCall(officeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     * @param officeId officeId (optional)
     * @return List&lt;GetGLClosureResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetGLClosureResponse> retrieveAllClosures(Long officeId) throws ApiException {
        ApiResponse<List<GetGLClosureResponse>> resp = retrieveAllClosuresWithHttpInfo(officeId);
        return resp.getData();
    }

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     * @param officeId officeId (optional)
     * @return ApiResponse&lt;List&lt;GetGLClosureResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetGLClosureResponse>> retrieveAllClosuresWithHttpInfo(Long officeId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAllClosuresValidateBeforeCall(officeId, null, null);
        Type localVarReturnType = new TypeToken<List<GetGLClosureResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Accounting closures (asynchronously)
     * Example Requests:  glclosures
     * @param officeId officeId (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAllClosuresAsync(Long officeId, final ApiCallback<List<GetGLClosureResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveAllClosuresValidateBeforeCall(officeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetGLClosureResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateGLClosure
     * @param glClosureId glClosureId (required)
     * @param body Request body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateGLClosureCall(Long glClosureId, PutGlClosuresRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/glclosures/{glClosureId}"
            .replaceAll("\\{" + "glClosureId" + "\\}", apiClient.escapeString(glClosureId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateGLClosureValidateBeforeCall(Long glClosureId, PutGlClosuresRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'glClosureId' is set
        if (glClosureId == null) {
            throw new ApiException("Missing the required parameter 'glClosureId' when calling updateGLClosure(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateGLClosure(Async)");
        }
        

        com.squareup.okhttp.Call call = updateGLClosureCall(glClosureId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     * @param glClosureId glClosureId (required)
     * @param body Request body (required)
     * @return PutGlClosuresResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PutGlClosuresResponse updateGLClosure(Long glClosureId, PutGlClosuresRequest body) throws ApiException {
        ApiResponse<PutGlClosuresResponse> resp = updateGLClosureWithHttpInfo(glClosureId, body);
        return resp.getData();
    }

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     * @param glClosureId glClosureId (required)
     * @param body Request body (required)
     * @return ApiResponse&lt;PutGlClosuresResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PutGlClosuresResponse> updateGLClosureWithHttpInfo(Long glClosureId, PutGlClosuresRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateGLClosureValidateBeforeCall(glClosureId, body, null, null);
        Type localVarReturnType = new TypeToken<PutGlClosuresResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an Accounting closure (asynchronously)
     * Once an accounting closure is created, only the comments associated with it may be edited
     * @param glClosureId glClosureId (required)
     * @param body Request body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateGLClosureAsync(Long glClosureId, PutGlClosuresRequest body, final ApiCallback<PutGlClosuresResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateGLClosureValidateBeforeCall(glClosureId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PutGlClosuresResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
