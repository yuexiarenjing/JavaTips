package designparten.factorymethod.factory;

public class MailSender implements Sender{
	@Override
	public void Send() {
		System.out.println("This is mail sender!");
	}
}
