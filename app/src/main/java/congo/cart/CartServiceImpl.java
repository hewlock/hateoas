package congo.cart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
class CartServiceImpl implements CartService
{
	private long nextId = 1;
	private final Map<Long, CartItem> items = new HashMap<Long, CartItem>();


	@Override
	public CartItem getCartItem(long itemId)
	{
		return items.get(itemId);
	}


	@Override
	public Collection<CartItem> getAllCartItems()
	{
		return items.values();
	}


	@Override
	public Collection<CartItem> removeAllCartItems()
	{
		Collection<CartItem> previousItems = new ArrayList<CartItem>(items.values());
		items.clear();
		return previousItems;
	}


	@Override
	public CartItem saveItem(CartItem item)
	{
		CartItem persisted = new CartItem(nextId++, item.getProduct());
		items.put(persisted.getId(), persisted);
		return persisted;
	}


	@Override
	public CartItem deleteItem(long itemId)
	{
		return items.remove(itemId);
	}
}