# AnchorSheetBehavior
[![Release](https://jitpack.io/v/User/Repo.svg)]
(https://jitpack.io/#User/Repo)

This repo contains an example of the modification of the BottomSheetBehavior with Anchor state.

Fine more about it at [the medium blog post](https://medium.com/@marxallski/from-bottomsheetbehavior-to-anchorsheetbehavior-262ad7997286#.m02n38t27).

# Integration 

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add OkSse dependency:
```groovy
dependencies {
    compile 'com.github.skimarxall:AnchorSheetBehavior:master-SNAPSHOT'
}
```

![](anchorsheetbehavior_demo.gif.gif)

License
=======

    Copyright 2015 Marcel Pintó Biescas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

