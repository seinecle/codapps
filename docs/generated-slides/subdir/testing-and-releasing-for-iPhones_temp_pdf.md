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
1. Before doing this lesson you must have completed the first lesson of this module, because it includes essential steps.
2. *You need a Mac computer*
====

//ST: !
As explained in the first lesson of this module, here are your options:

a. paying 99$ (per year) to access Apple's Developer program.
** this allows you to test your app on your own phone
** you can release your app on the App Store *if Apple judges that your app is "good enough"*

//ST: !
[start=2]
b. access an https://developer.apple.com/programs/ios/university/[iOS Developer University Program]
** this allows you to test your app on your own phone *for free*
** you cannot release your app on the App Store (unless you pay the 99$ of course)

//ST: !
Codename One provides straightforward help and tutorials for case a. Have a look:

//ST: !
video::pOLOoZFHxwU[youtube]

Or visit https://www.codenameone.com/blog/ios-certificate-wizard.html[the corresponding web page].

//ST: !
In this lesson, we focus on case b.

http://www.em-lyon.com/en[Emlyon business school] students have access to the iOS Developer University Program and we will see here how to use it.

If you are in a different school, ask your administration how they could set up such a program! (it is free).

//ST: !
Make sure you have an hour ahead of you, some tea or coffee and plenty of patience. This is going to be a long road.

//ST: !
image::Releasing-your-app-for-iOS.png[align="center",title="Releasing your app for iOS"]
{nbsp} +

== 2. The long road
//ST: 2. The long road

//ST: !
[WARNING]
====
The app, once published on the the Apple App Store, will be public. [underline]#Make sure your app does not include personal content# (pictures, personal details...) that you do not want to get public!
====

//ST: !
==== a. Getting access to the Apple Developer Console

//ST: !
You have received an email inviting you to join an Apple Developer program :
If you don’t find this email, check your spam folder !

//ST: !
image::ios-release-univ-1.jpg[align="center", title="Email invitation"]
{nbsp} +

//ST: !
Open this email, click on the link :

//ST: !
image::ios-release-univ-2.jpg[align="center", title="Content of the email"]
{nbsp} +

//ST: !
On the page that opens, choose "I need to register as an Apple Developer"

//ST: !
image::ios-release-univ-3.jpg[align="center", title="Registration as an Apple Developer"]
{nbsp} +

//ST: !
Then you arrive on a screen that asks you to use your Apple id:

a.	If you have an Apple Id (because you own a Mac, or an iPhone, or because you use iTunes…), choose "sign in"
b.	If you don’t have an Apple id, choose "Create an Apple Id"

//ST: !
image::ios-release-univ-4.jpg[align="center", title="Apple id"]
{nbsp} +

//ST: !
Then you need to agree on the license:

//ST: !
image::ios-release-univ-5.jpg[align="center", title="Apple Developer Agreement"]
{nbsp} +

//ST: !
You should be redirected to this page, which is the place where you manage the certificates of your apps for iPhones.

Congratulations, that's already a big step!

//ST: !
==== b. Generating a certificate request

//ST: !
Click on 'Certificates, Identities and Profiles'

//ST: !
image::ios-release-univ-6.jpg[align="center", title="Access certificates"]
{nbsp} +

//ST: !
Click on `Certificates -> All` then click on the `+` sign, to add a new certificate for your app :

//ST: !
image::ios-release-univ-7.png[align="center", title="Adding a certificate"]
{nbsp} +

//ST: !
1. Choose "iOS App Development",
2. click on "Worldwide Developer Relations Certificate Authority"
**  it will download a file on you computer.
3. Then click on "Continue"

//ST: !
image::ios-release-univ-8.png[align="center", title="step 1 of the creation"]
{nbsp} +

//ST: !
You should arrive on this screen, *stay on it*:

//ST: !
image::ios-release-univ-9.png[align="center", title="step 2 of the creation"]
{nbsp} +

//ST: !
In the Finder on your Mac, open the Applications folder (image:ios-release-univ-10.png[]), and inside it, open the "Utilities" folder:

//ST: !
image::Opening-the-Utilities-Folder.png[align="center", title="Opening the Utilities Folder"]
{nbsp} +

//ST: !
In the "Utilities" folder, open the Keychain access:


//ST: !
image::Opening-the-Keychain-access.png[align="center", title="Opening the Keychain access"]
{nbsp} +
In the window that opens, select in the menu "Keychain access -> Certificate Assistant -> Request a Certificate from a Certificate Authority":

//ST: !
image::Requesting-a-certificate.png[align="center", title="Requesting a certificate"]
{nbsp} +

//ST: !
In the small window that opens:

-	In the field "User email address", put the email address *of your Apple ID*
-	In the field "Common Name", put your *emlyon email address*
-	Then choose "save to disk" and click on "continue".

I suggest you create a folder somewhere on your computer called "Apple certificates", where you will save the file.

//ST: !
image::ios-release-univ-14.png[align="center", title="Filling in details"]
{nbsp} +

//ST: !
Now, let’s go back to the website of the Apple Dev Center, where we can continue where we left !

[TIP]
====
If there is an error on the page, it just means that the page expired. Just reload it, and go back to the screen where we left
====

//ST: !
Upload the file "CertificateSigningRequest.certSigningRequest" that you just saved on your disk:

//ST: !
image::ios-release-univ-15.png[align="center", title="Uploading the certificate request"]
{nbsp} +

//ST: !
This upload is the step that creates your certificate. Congratulations! That's also a big step you just accomplished!

//ST: !
==== c. Using the certificate

//ST: !
Now download the certificate to your disk, in the same folder. It should be called "ios_development.cer":

//ST: !
image::ios-release-univ-16.png[align="center", title="Downloading the certificate"]
{nbsp} +

//ST: !
Find your file "ios_development.cer" where you saved it. Double click on it. This will open the Keychain access:

-	 click on "Certificates" in the left menu
-	Right click on the name of your certificate and choose "Export…"

//ST: !
image::ios-release-univ-17.png[align="center", title="Exporting the certificate"]
{nbsp} +

//ST: !
This opens a window asking for a password. Put "emlyon1000":

//ST: !
image::ios-release-univ-18.png[align="center", title="Assigning a password"]
{nbsp} +

//ST: !
Then on the next screen you are asked again for a password.

You should use the password of your Mac computer (the one you use to login when the computer starts) :

//ST: !
image::ios-release-univ-19.png[align="center", title="Confirming with the Mac password"]
{nbsp} +

//ST: !
You are invited to save a file on your disk. This is a file with "p12", save it in the same folder where you saved your other files for this certificate.

//ST: !
==== d. Getting the UDID of your phone

//ST: !
We need the UDID of your phone, the one where you will install and test your app.

The UDID is the unique identifier of your iPhone. You can find it by plugging your phone to iTunes. A very simple tutorial explains it here : http://whatsmyudid.com/

Once you have your UDID, write it to me here: http://goo.gl/forms/mmotEWvRYs

//ST: !
And now wait just a couple of days… I need to collect all UDID from students before I create “Provisioning Profiles” (yes, this process is long and horrible, but we are NEARLY there!).

I’ll send you an email when you can resume this lesson, at the step just below: "Downloading a provisioning profile"

//ST: !
==== e. Downloading the Provisioning Profile

//ST: !
Go to “Provisioning Profiles” and download the most recent one:

[TIP]
====
I advise you to download it to the same folder where you saved the previous files created in this tutorial, related to certificates.
====

//ST: !
image::ios-release-univ-20.png[align="center", title="Downloading the most recent provisioning profile"]
{nbsp} +

//ST: !
image::ios-release-univ-20.png[align="center", title="Downloading the most recent provisioning profile"]
{nbsp} +

//ST: !
Now, open NetBeans, right click on the name of your project, and select “Properties” (last item at the bottom).

//ST: !
Please check the screenshot below and the numbered steps, and read the indications for each of them:

1.	Select “iOS” on the menu on the left
2.	For Certificate, choose the file with the name ending in “p12” that you saved on your computer in this lesson
3.	For Certificate password, write “emlyon1000”

//ST: !
[start=4]
4.	For provisioning profile, choose the one we just downloaded
5.	In app ID, you must add “4RVRDEN5JP.” Just before io.codapps
6.	Validate

//ST: !
image::ios-release-univ-21.png[align="center", title="Filling in the properties in NetBeans"]
{nbsp} +

== 3. The end of the road: sending your build to Codename One
//ST: 3. The end of the road: sending your build to Codename One

//ST: !
The version of your app that you will build to install on your iPhone is considered to be for the purpose of testing and debbuging.

For this reason, we will call it the "iOS debug build".

Launch the iOS debug build by right clicking on your project's name:

//ST: !
image::Sending-the-iOS-Debug-Build.png[align="center", title="Sending the iOS Debug Build"]
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
And now, you can simply test your app on your iPhone.

Let's see how:

== 4. Installing the app on the iPhone
//ST: 4. Installing the app on the iPhone

//ST: !
- Take your phone and open the QR code reader app that you installed on it.
- Flash the QR code displayed on your successful build on www.codenameone.com.
- Your app should install on your phone (follow the steps / confirm)
- go and find the icon of your app on your phone, open it and enjoy it!


== The end
//ST: The end

//ST: !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/emlyon/codapps/issues[here] (need a free Github account).

//ST: !
Find references for this lesson, and other lessons, https://emlyon.github.io/codapps/[here].

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
