@echo off
cls

echo.
powershell write-host -foregroundcolor Green "*** REFRESHING GRADLE DEPENDENCIES ***"
REM run gradle war build, with option activeProfiles = prod.
REM according to build.gradle this will replace placeholder @activeProfiles@ in application.properties with "prod"
REM cmd /C gradlew build -PactiveProfiles=dev --refresh-dependencies
cmd /C gradlew build --refresh-dependencies

echo.
powershell write-host -foregroundcolor Green "*** REFRESH FINISHED ***"
PAUSE
