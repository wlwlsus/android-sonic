# 콩콩마켓(당근마켓 Clone Coding)

- Developer : Wonjoon Seong
- E-mail : dontsc0814@gmail.com

![image](https://user-images.githubusercontent.com/58021968/137633396-42ec1988-53cd-4001-b88c-7eeb024a9857.png)
![image](https://user-images.githubusercontent.com/58021968/137634123-d185af6d-a815-4582-994a-4b3346c7d824.png)

## Introduction
1. It is a project to clone-coded the 'Carrot Market' application in the Play Store.
2. Users can register and sell their used products.
3. Users can communicate with other users around them.
4. The application is not used for commercial purposes.
<br>

## Development Environment
- Windows 10
- Android Studio
- Gradle
<br>

## Tech stack
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- [Hilt](https://dagger.dev/hilt/) for dependency injection.
- JetPack
  - Lifecycle - dispose of observing data when lifecycle state changes.
  - ViewModel - UI related data holder, lifecycle aware.
  - Room Persistence - construct a database using the abstract layer.
- Architecture
  - MVVM Architecture + Clean Architecture
- [Retrofit2](https://github.com/square/retrofit) - construct the REST APIs and paging network data.
- [Glide](https://github.com/bumptech/glide) - Image
- [Navigation](https://developer.android.com/guide/navigation/navigation-getting-started?hl=ko) - used to switch screens
- [ViewPager2](https://developer.android.com/jetpack/androidx/releases/viewpager2?hl=ko) - Paging Techniques Library
- [Timber](https://github.com/JakeWharton/timber) - logging.
<br>

## Architecture
- Based on MVVM and Clean Architecture.


<img src="https://user-images.githubusercontent.com/58021968/125732196-fde254a4-0f05-4082-875a-55bf1feb5aed.png" height="500"/>
<br>
