= CODAPPS: Testing and releasing your app for iPhones
Clément Levallois <levallois@em-lyon.com>
2018-01-22

last modified: {docdate}

:icons!:
:source-highlighter: rouge
:iconsfont: font-awesome
:revnumber: 1.0
:example-caption!:
:sourcedir: ../../../../main/java


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. Preliminary setup
//ST: 1. Preliminary setup

//ST: !
[WARNING]
====
Before doing this lesson you must have completed the first lesson of this module, because it includes essential steps.
====


//ST: !
And finally, these differences have a consequence for you, who learn how to make apps.

//ST: !
- If you don't have an app which is "market ready" (interesting to potential users), Apple will reject it from their App store
- Even if you want to create an app and test it just on your own phone (not releasing it on the App Store), it will cost you 99$ per year to join the Apple Developer Program.

//ST: !

//ST: !
==== a. Take an Android phone and install a QR code reader on it

//ST: !
So you obviously need an Android phone. But also an app installed on this phone, to read QR codes.

QR codes are very common and you surely have seen them before, they look like:

//ST: !
image::qrcode.png[align="center",title="An example of  QR code"]
{nbsp} +

//ST: !
We need an app on our Android phone able to read QR codes, *because this is how we will transfer our app onto our phone* (fancy!).

Just go on the Play Store, search "QR code", and install a free app doing QR code reader.

//ST: !
==== c. Create A developer account on Google's Play Store (25$)

//ST: !
You don't need this step if you just want to test your app on your own Android phone.

[NOTE]
====
em *lyon business school* students: we provide you with a free access to a Google Play Store account.

You will receive the invitation by email. You can ignore this and move on to the next part of this lesson.
====

//ST: !
To release your app on the Play Store, you need to create an account.

Visit the webpage to sign up for a Google Play developer account: https://play.google.com/apps/publish/signup[https://play.google.com/apps/publish/signup].

//ST: !
A one-time *25$ fee for a lifetime membership* to the Google Developer Program is requested.

With this fee you can distribute an unlimited number of apps, without limit of time.


//ST: !
==== f. Generate a Google certificate for the app

//ST: !
A certificate is the unique and "tamperproof" ID of your app. It is used by Google to make sure that your app is indeed the one it claims to be, and not one corrupted by a third party.

//ST: !
Generating certificates can be a long and painful process (watch the lesson on certificates for iPhone apps and cry...). Luckily, Google's process is simpler, and Codename One makes it even simpler.

Follow these steps:

//ST: !
Return to the `Properties` of your project:

//ST: !
image::Accessing-the-properties-of-your-project.png[align="center",title="Accessing the properties of your project"]
{nbsp} +

//ST: !
You can now access the Android settings of your project. *Be extra careful in following these instructions* as mistakes are particularly frustrating to debug:

//ST: !
image::Android-properties-of-your-project.png[align="center",title="Android properties of your project"]
{nbsp} +

//ST: !
image::Generating-a-certificate.png[align="center",title="Generating a certificate"]
{nbsp} +

//ST: !
Your Google certificate is now generated! Close the properties of the project by clicking on `OK` and be ready to create the Android version of your app!

== 2. Launching the build
//ST: Launching the build

//ST: !
With all the setup completed, we are nearly finished.

Launch the build of the Android app by right clicking on your project's name:

//ST: !
image::Launching-the-Android-build.png[align="center",title="Launching the Android build"]
{nbsp} +

//ST: !
If you get a "Build failed" message at the end, don't worry this is very common not to succeed at the first time.

Read the lesson in this module about possible causes and solutions.

If you get a successful build, continue here:

//ST: !
Now you should open your web browser, go to http://www.codenameone.com[http://www.codenameone.com] and login to your account.

Then go to the Dashboard:

//ST: !
image::Checking-the-result-on-the-website-of-Codename-One.png[align="center",title="Checking the result on the website of Codename One"]
{nbsp} +

//ST: !
If the build is green and successful, you can go ahead and follow the next instructions below.

If it is red, again this is quite usual the first times. You can read the special lesson in this module to help you diagnostic and solve the error.

//ST: !
Ok, assuming your build was successful and "green", click on *the date and time* shown on it:

//ST: !
image::Revealing-the-QR-code-and-the-download-options.png[align="center",title="Revealing the QR code and the download options"]
{nbsp} +

//ST: !
And now, you can simply test your app on your Android phone, or publish it on Google's Play Store.

Let's see how:

== 3. Testing the app on an Android Phone
//ST: 3. Testing the app on an Android Phone

//ST: !
- Take your phone and open the QR code reader app that you installed on it.
- Flash the QR code displayed on your successful build on www.codenameone.com.
- Your app should install on your phone (follow the steps / confirm)
- go and find the icon of your app on your phone, open it and enjoy it!

== 4. Publishing your app on Google's Play Store
//ST: 4. Publishing your app on Google's Play Store

//ST: !
Download the "apk" file on your computer. This file is your Android app!

(if you are curious, `apk` stands for `Android package`)

//ST: !
image::Downloading-the-apk-file-to-your-computer.png[align="center",title="Downloading the apk file to your computer"]
{nbsp} +

//ST: !
Now, login to your Google Play Developer account at https://play.google.com/apps/publish[https://play.google.com/apps/publish]

- we created this Google Play Console account in one of the steps above
- *em lyon business school students*: log in to your account by following the instuctions you received by email.

//ST: !
image::Creating-a-new-app-on-your-Google-Play-Console.png[align="center",title="Creating a new app on your Google Play Console"]
{nbsp} +

//ST: !
You now have access to the menu for your app.

Upload your apk here:

//ST: !
image::Upload-your-apk-here.png[align="center",title="Upload your apk here"]
{nbsp} +

//ST: !
The Play Store now requires that you add screenshots of your app to market it.

There are a number of screenshots of you app to create and upload, each at  precise pixel size. You will find https://support.google.com/googleplay/android-developer/answer/1078870?hl=en[help and indications here].

This website might also be useful to create the screenshots: http://www.appscreenshot.me/

//ST: !
Finally, there are a number of parameters for you to set. They are shown with an "alert sign" icon on your page:

//ST: !
image::Visit-and-set-every-parameter-flagged-with-an-icon.png[align="center",title="Visit and set every parameter flagged with an icon"]
{nbsp} +

//ST: !
When all these parameters will be set, your app will become publishable.


== The end
//ST: The end

//ST: !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/seinecle/codapps/issues[here] (need a free Github account).

//ST: !
Find references for this lesson, and other lessons, https://seinecle.github.io/codapps/[here].

//ST: !
Licence: Creative Commons, https://creativecommons.org/licenses/by/4.0/legalcode[Attribution 4.0 International] (CC BY 4.0).
You are free to:

- copy and redistribute the material in any medium or format
- Adapt — remix, transform, and build upon the material

=> for any purpose, even commercially.

//ST: !
image:round_portrait_mini_150.png[align="center", role="right"]
This course is designed by Clement Levallois.

Discover my other courses in data / tech for business: http://www.clementlevallois.net

Or get in touch via Twitter: https://www.twitter.com/seinecle[@seinecle]
