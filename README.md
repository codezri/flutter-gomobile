# flutter-gomobile
This sample Flutter app invokes a function written in Go via Flutter platform channels with Go mobile bind. Implemented only in the Android embedder app.

## How to run the app?

- Clone the repository. Install Android SDK, NDK, and Go mobile.
- Generate the Android library with `gomobile bind --target android`, and copy generated `.aar` to `src/libs`.
- Run the Flutter app with `flutter run`

## License
[MIT](LICENSE)
