package org.sead.collect.android.openrosa;

import org.sead.collect.android.openrosa.okhttp.OkHttpConnection;
import org.sead.collect.android.openrosa.okhttp.OkHttpOpenRosaServerClientProvider;

import okhttp3.OkHttpClient;

public class OkHttpConnectionPostRequest extends OpenRosaPostRequestTest {

    @Override
    protected OpenRosaHttpInterface buildSubject(OpenRosaHttpInterface.FileToContentTypeMapper mapper) {
        return new OkHttpConnection(
                new OkHttpOpenRosaServerClientProvider(new OkHttpClient()),
                mapper,
                "Test Agent"
        );
    }
}
