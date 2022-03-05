package com.example.gomobilefrontend;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import gomobilelib.GoMobileLib;

public class MainActivity extends FlutterActivity {
  private static final String CHANNEL = "example.com/gomobilelib";

  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {

    GoMobileLib goMobileLib = new GoMobileLib();

    super.configureFlutterEngine(flutterEngine);
      new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
        .setMethodCallHandler(
          (call, result) -> {
            if(call.method.equals("getRandomNumber")) {
              result.success(goMobileLib.randomNumber());
            }
            else {
              result.notImplemented();
            }
          }
        );
  }
}
