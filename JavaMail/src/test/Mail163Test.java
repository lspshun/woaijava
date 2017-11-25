package test;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail163Test {
	public static void main(String[] args) throws Exception {
		// 0.1 ȷ������λ��
		Properties props = new Properties();
		// ��ȡ163����smtp�������ĵ�ַ��
		props.setProperty("mail.host", "smtp.163.com");
		// �Ƿ����Ȩ����֤��
		props.setProperty("mail.smtp.auth", "true");

		// 0.2ȷ��Ȩ�ޣ��˺ź����룩
		Authenticator authenticator = new Authenticator() {
			@Override
			public PasswordAuthentication getPasswordAuthentication() {
				// ��д�Լ���163����ĵ�¼�ʺź���Ȩ����
				return new PasswordAuthentication("lspshun@163.com", "lspshun2000");
			}
		};

		// 1 �������
		/**
		 * props������������Ϣ�Ķ���Properties���� ���������������ַ�������Ƿ����Ȩ����֤(�ʺ�������֤)��
		 * 
		 * authenticator��ȷ��Ȩ��(�ʺź�����)
		 * 
		 * ���Ծ�Ҫ�����湹������������
		 */

		Session session = Session.getDefaultInstance(props, authenticator);

		// 2 ������Ϣ
		Message message = new MimeMessage(session);
		// 2.1 ������ xxx@163.com �����Լ��������ַ����������
		message.setFrom(new InternetAddress("lspshun@163.com"));
		/**
		 * 2.2 �ռ��� ��һ�������� RecipientType.TO �����ռ��� RecipientType.CC ���� RecipientType.BCC
		 * ���� ����AҪ��B���ʼ�������A�����б�Ҫ��Ҫ��CҲ���������ݣ����ڸ�B���ʼ�ʱ��
		 * ���ʼ����ݳ��͸�C����ôCҲ�ܿ����������ˣ�����BҲ��֪��A��C���͹��÷��ʼ� ������ǰ���(����)��C�Ļ�����ôB�Ͳ�֪��A��C���͹��÷��ʼ���
		 * �ڶ������� �ռ��˵ĵ�ַ��������һ��Address[]������װ���ͻ��߰����˵���������������Ⱥ������������ͬ����������ģ�Ҳ�����ǲ�ͬ��
		 * �������Ƿ��͸����ǵ�qq����
		 */
		message.setRecipient(RecipientType.TO, new InternetAddress("509851698@qq.com"));
		// 2.3 ���⣨���⣩
		message.setSubject("�ȷ�");
		// 2.4 ����
		String str = "����ȥ����Է�?";
		// ���ñ��룬��ֹ���͵������������롣
		message.setContent(str, "text/html;charset=UTF-8");

		// 3������Ϣ
		Transport.send(message);
	}
}