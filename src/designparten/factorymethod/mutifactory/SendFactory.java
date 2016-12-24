package designparten.factorymethod.mutifactory;

public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
}
