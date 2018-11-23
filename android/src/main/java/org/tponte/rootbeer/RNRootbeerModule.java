
package org.tponte.rootbeer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import com.scottyab.rootbeer.RootBeer;

public class RNRootbeerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRootbeerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRootbeer";
  }

  @ReactMethod
  public void isRooted(Promise promise) {
    RootBeer check = new RootBeer(reactContext);

    promise.resolve(check.isRooted());
  }

  @ReactMethod
  public void isRootedWithoutBusyBoxCheck(Promise promise) {
    RootBeer check = new RootBeer(reactContext);

    promise.resolve(check.isRootedWithoutBusyBoxCheck());
  }
}