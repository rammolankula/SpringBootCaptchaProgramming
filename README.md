# SpringBootCaptchaProgramming
#### Application 1
SpringBoot Sample Captcha programming with the help of MVC.
![image](https://github.com/rammolankula/SpringBootCaptchaProgramming/assets/53596726/d2229590-ae5d-49df-b8af-54c35f9df695)
Model view Controller
<pre>
&#8594; Create a Spring boot starter project
&#8594; Required Dependencies Web,lombok,DataJPA,thymeleaf,simplecaptcha,MySql Connector
&#8594; Written one model class for Writting simple CURD operations
&#8594; Written Controller,serviceInterfaceLayer,serviceImplementationLayer, captchaUtil,repoInterface
</pre>
#### Code Flow (execution of Captcha)
<pre>
  &#8594; When the Request landed to Controller of application Example 
  &#8594; URL:http://localhost:8087/emp/register
  ![Screenshot (21)](https://github.com/rammolankula/SpringBootCaptchaProgramming/assets/53596726/c8594b2c-e171-43c7-9ab1-8c0c612f746f)
  &#8594; it will open the above the UI
  &#8594; in code it will generate one Captcha in png format with specified mirgins and we are storing in data base
  &#8594; When ever user wants save the details captcha will validated if not we are giving the invalid captcha error exception
  &#8594; then user will get the list of employee details after saving.
  &#8594; if user wants to edit the specified data there is an option for edit user need to give the captcha for edit
</pre>
![Screenshot (20)](https://github.com/rammolankula/SpringBootCaptchaProgramming/assets/53596726/57cfe94e-737e-4a03-9fa6-e43d72fdde25)


##### Application 2
SpringBoot Sample ReCaptcha programming with the help of MVC.
<pre>
Spring ReCaptcha same as above but We need to follow some instructions like site-Key and seceret-key for using reCaptcha
&#8594; Here we no need to write any logic for recaptcha Example :in Service Layer or Controller no need to write
&#8594; Write simple CURD operation same as above i.e 1st application
&#8594; In the Register page, it is necessary to first register on the reCAPTCHA portal before incorporating the secret key. 
&#8594;  As an example, the following code snippet should be added to the Register page after obtaining the required registration on the reCAPTCHA portal.
  ![Recaptcha](https://github.com/rammolankula/SpringBootCaptchaProgramming/assets/53596726/cc9400ab-873a-47d8-bfc5-efc2bbb5e51f)
</pre>
![Screenshot (23)](https://github.com/rammolankula/SpringBootCaptchaProgramming/assets/53596726/dbb82228-83f1-4630-83e1-4776c09c1f08)
