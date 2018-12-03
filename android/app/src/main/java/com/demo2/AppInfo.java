// AppInfo.java

package com.demo2;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class AppInfo extends ReactContextBaseJavaModule {

  private static final String APP_FLAVOR_KEY = "flavorName";

  public AppInfo(ReactApplicationContext reactContext) {
    super(reactContext);
  }
  @Override
  public String getName() {
    return "AppInfo";
  }
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(APP_FLAVOR_KEY, BuildConfig.FLAVOR);
    return constants;
  }
}