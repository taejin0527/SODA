package com.tak.soda.function;

import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@Service
public class RandomAccessToken {

	private Random random = SecureRandom.getInstanceStrong();

	public RandomAccessToken() throws NoSuchAlgorithmException {
	}
	//	토큰발급
	public String makeToken(int size) {
		// Random random = new Random();
		System.out.println("token size: " + size);
		StringBuffer buffer = new StringBuffer();
		while(buffer.length()<size) {
			int num = random.nextInt(3);
//			숫자
			if(num==0) {
				num = random.nextInt(10);
				buffer.append(num);
			}
//			소문자
			else if(num==1) {
				num = random.nextInt(10)+65;
				char cnt = (char) num;
				buffer.append(cnt);
			}
//			대문자
			else {
				num = random.nextInt(10)+97;
				char cnt = (char) num;
				buffer.append(cnt);
			}
		}
		System.out.println("token: " + buffer.toString());
		return buffer.toString();
	}

}
