package congo.order.resource;

import org.springframework.hateoas.ResourceSupport;

public class OrderPostResource extends ResourceSupport
{
	private String creditCardNumber;
	private String address;


	public String getCreditCardNumber()
	{
		return creditCardNumber;
	}


	public void setCreditCardNumber(String creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}


	public String getAddress()
	{
		return address;
	}


	public void setAddress(String address)
	{
		this.address = address;
	}
}
