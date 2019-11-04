package com.doto.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class DotoUtis {

	private DotoUtis() {
		// Hiding the constructor so that it can't be created with new keyword
	}

	public static String getMD5(String phrase) {

		try {
			final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(phrase.getBytes());
			final byte[] digest = messageDigest.digest();
			final StringBuffer sb = new StringBuffer();

			for (byte b : digest) {
				sb.append(Integer.toHexString((int) b & 0xff));
			}

			return sb.toString();

		} catch (NoSuchAlgorithmException e) {
			// TODO Handle properly
			e.printStackTrace();
		}

		return null;
	}
	
	public static String getUniqueId() {
		return getMD5(UUID.randomUUID().toString());
	}

}
