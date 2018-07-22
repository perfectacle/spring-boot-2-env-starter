You can change java version by editing sourceCompatibility in build.gradle file.

## Run
```bash
# local
./gradlew bootRun

# dev
./gradlew bootRun -Pprofile=dev

# prod
./gradlew bootRun -Pprofile=prod
```

## Build
```bash
# local
./gradlew build

# dev
./gradlew build -Pprofile=dev

# prod
./gradlew build -Pprofile=prod
```

