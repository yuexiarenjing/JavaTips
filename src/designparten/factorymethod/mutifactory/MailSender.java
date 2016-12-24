package designparten.factorymethod.mutifactory;

public class MailSender implements Sender{
	@Override
	public void Send() {
		System.out.println("This is mail sender!");
	}
}
