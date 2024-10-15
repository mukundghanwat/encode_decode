package com.sample;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoder {
	static String message = "Mukund Ghanwat";

	public static void main(String[] args) {
		System.out.println("Plain String:: " + message);
		String encodedString = encode(message);
		System.out.println("Encoded String:: " + encodedString);
		String decodedString = decode(encodedString);
		System.out.println("Decoded String:: " + decodedString);
	}

	/**
	 * This method is used to encode data
	 * 
	 * @param message
	 * @return String
	 */
	public static String encode(String message) {
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(message.getBytes());
		return encodedString;
	}

	/**
	 * This method is used to decode the message
	 * 
	 * @param encodedMsg
	 * @return String
	 */
	public static String decode(String encodedMsg) {
		Decoder decoder = Base64.getDecoder();
		byte[] decodeArray = decoder.decode(encodedMsg);
		String decodeString = new String(decodeArray);
		return decodeString;
	}

}
