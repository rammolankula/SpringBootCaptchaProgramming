package ram.learn.captchaobject;

import java.io.ByteArrayOutputStream;
import java.util.Base64;

import javax.imageio.ImageIO;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.noise.CurvedLineNoiseProducer;
import cn.apiclub.captcha.text.producer.DefaultTextProducer;

public class Utilcaptcha {

	// create a captcha object
	public static Captcha createCaptcha(int width, int height) {
		return new Captcha.Builder(width, height).addBackground(new GradiatedBackgroundProducer())
				.addText(new DefaultTextProducer()).addNoise(new CurvedLineNoiseProducer()).build();
	}

	// convert into string

	public static String encodebase64(Captcha captcha) {
		String imagedata = null;
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(captcha.getImage(), "png", os);
			byte[] arr = Base64.getEncoder().encode(os.toByteArray());
			imagedata = new String(arr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return imagedata;

	}

}
