= CODAPPS: Testing and releasing your app for Android
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
[NOTE]
====
The setup will take 95% of this lesson. So do not worry or get bored if this is long, as you will be nearly finished upon the completion of the setup!
====

//ST: !
For a global view on the steps to create, test and release your app for Android phones, tablets and iPhones, please refer to the lesson in this same module.

In this lesson, we focus on creating, testing and releasing your app for Android Phones.

//ST: !
Working on apps for Android phones and tablets is fairly simple, and made even simpler by Codename One, the tool we use in this course.

Here is the list of what you'll need:

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
==== b. Create a free account on Codename One

//ST: !
If you remember the workflow illustrated in the intro to this module, Codename One is the service providing the plugin we use in NetBeans.

*Codename One will convert our app into an Android app*. So we need to create an account with them.

//ST: !
Codename One is a commercial company proposing an open source tool. They have several pricing plans:

//ST: !
- the free plan. It gives you access to everything but puts a *size limit* on your app.
- the basic, pro and entreprise plans, which give extra capabilities.

*In the CODAPPS course we use the free plan*.

//ST: !
To create your account, go on http://www.codenameone.com[www.codenameone.com] and just *sign up* for an account:

//ST: !
image::The-codename-one-website.png[align="center",title="The codename one website"]
{nbsp} +

//ST: !
*Make sure you remember the email and password* you used to sign up as we will need them later.

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
==== d. Set up your phone to accept apps from unknown sources

//ST: !
This step is necessary only for testing the app on your phone.
For security reasons, your phone accepts to install only apps coming from the Google Play Store.

*You must unlock this feature so that you can test your own app.*

//ST: !
The latest versions of Android will invite you to unlock when you are installing your app, but on older phones you need to do it beforehand:

//ST: !
- go to the parameters of your phone
- in the security settings, switch on the "install from unknown sources".

This website provides an illustration:

//ST: !
https://www.softwarert.com/install-apps-unknown-sources-android-phones/[https://www.softwarert.com/install-apps-unknown-sources-android-phones/]

(__Depending on your phone and version of Android, your screens will look slightly different__)

[WARNING]
====
Make sure to switch off this parameter after you installed your app.
====

//ST: !
==== e. Connect NetBeans to your Codename One account

//ST: !
In NetBeans, *right click* on the name of your project and select `Properties`:

//ST: !
image::Accessing-the-properties-of-your-project.png[align="center",title="Accessing the properties of your project"]
{nbsp} +

//ST: !
image::Codename-One-properties.png[align="center",title="Codename One properties"]
{nbsp} +

//ST: !
A login window opens. You should enter *the email and password of the account you created on the Codename One website* (see above in the lesson).

This is how NetBeans will be able to send the app you created to the Codename One website!

//ST: !
image::testing-android-3.png[align="center", title="Entering your Codename One credentials"]
{nbsp} +

//ST: !
Then close all the windows we opened by clicking on `OK`.
You are almost ready to send your app to Codename One.

The last step consists in generating a Google certificate for your app.

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
