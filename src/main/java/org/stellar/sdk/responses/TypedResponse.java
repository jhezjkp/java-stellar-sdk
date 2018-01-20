package org.stellar.sdk.responses;

import com.google.gson.reflect.TypeToken;

public interface TypedResponse<T> {

	void setType(TypeToken<T> type);

}