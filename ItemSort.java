import java.util.*;


public class ItemSort
{


	private static class Item
	{
		private String name;
		private String type;
		private String sku;

		public Item(String name, String type, String sku)
		{
			this.name = name;
			this.type = type;
			this.sku = sku;
		}

		public String getName()
		{
			return name;
		}

		public String getType()
		{
			return type;
		}

		public String getSku()
		{
			return sku;
		}

	}

	private static class Box
	{
		private List<Item> items;

		public Box (List<Item> items)
		{
			this.items = items;
		}

		public Box()
		{
			items = new ArrayList<Item>();
		}

		public void addItem(Item item)
		{
			items.add(item);
		}

		public List<Item> getItems()
		{
			return items;
		}
	}

	private static List <Item> items = new ArrayList<Item>();

	private static List <Item> housewares = new ArrayList<Item>();
	private static List <Item> shoes = new ArrayList<Item>();
	private static List <Item> bags = new ArrayList<Item>();
	private static List <Item> hats = new ArrayList<Item>();
	private static List <Item> clothing = new ArrayList<Item>();
	private static List <Item> beauty = new ArrayList<Item>();
	private static List <Item> accessories = new ArrayList<Item>();

	private static List <Box> boxes = new ArrayList<Box>();


	public static void main( String[] args )
	{
		
		items.add(new Item( "cool blender", "Housewares", "2345746" ) );
		items.add(new Item( "cool toaster", "Housewares", "9345746" ) );
		items.add(new Item( "cool heels", "Shoes", "3345746" ) );
		items.add(new Item( "cool sandals", "Shoes", "3345746" ) );
		items.add(new Item( "cool flats", "Shoes", "3345746" ) );
		items.add(new Item( "cool oxfords", "Shoes", "3345746" ) );
		items.add(new Item( "cool boots", "Shoes", "3345746" ) );
		items.add(new Item( "cool booties", "Shoes", "3345746" ) );
		items.add(new Item( "cool jellies", "Shoes", "3345746" ) );
		items.add(new Item( "cool chukkas", "Shoes", "3345746" ) );
		items.add(new Item( "cool stilettos", "Shoes", "3345746" ) );
		items.add(new Item( "cool birks", "Shoes", "3345746" ) );
		items.add(new Item( "cool handbag", "Bags", "4345746" ) );
		items.add(new Item( "cool clutch", "Bags", "4345746" ) );
		items.add(new Item( "cool hobo", "Bags", "4345746" ) );
		items.add(new Item( "cool beanie", "Hats", "5345746" ) );
		items.add(new Item( "cool sunhat", "Hats", "5345746" ) );
		items.add(new Item( "cool cowboy hat", "Hats", "5345746" ) );
		items.add(new Item( "cool trucker hat", "Hats", "5345746" ) );
		items.add(new Item( "cool pants", "Clothing", "6345746" ) );
		items.add(new Item( "cool lipstick", "Beauty", "7345746" ) ) ;
		items.add(new Item( "cool accessory", "Accessories", "8345746" ) );
		items.add(new Item( "cool jewelry", "Accessories", "8345746" ) );
		items.add(new Item( "cool scarf", "Accessories", "8345746" ) );
		items.add(new Item( "cool sunglasses", "Accessories", "8345746" ) );

		sortTypes();
		printTypes( "Housewares", housewares );
		printTypes( "Shoes", shoes );
		printTypes( "Bags", bags );
		printTypes( "Hats", hats );
		printTypes( "Clothing", clothing );
		printTypes( "Beauty", beauty );
		printTypes( "Accessories", accessories );

		calculateBoxContents( housewares );
		calculateBoxContents( shoes );
		calculateBoxContents( bags );
		calculateBoxContents( hats );
		calculateBoxContents( clothing );
		calculateBoxContents( beauty );
		calculateBoxContents( accessories );

		printBoxContents();
	}

	// sorts types
	private static void sortTypes()
	{
		for ( Item i : items)
		{
			if ( i.getType().equals("Housewares") )
			{
				housewares.add(i);
			} 
			else if ( i.getType().equals("Shoes") )
			{
				shoes.add(i);
			}
			else if ( i.getType().equals("Bags") )
			{
				bags.add(i);
			}
			else if ( i.getType().equals("Hats") )
			{
				hats.add(i);
			}
			else if ( i.getType().equals("Clothing") )
			{
				clothing.add(i);
			}
			else if ( i.getType().equals("Beauty") )
			{
				beauty.add(i);
			}
			else if ( i.getType().equals("Accessories") )
			{
				accessories.add(i);
			}
		}
	}

			
	// print sorted categories
	public static void printTypes(String type, List<Item> items)
	{

		System.out.println( "Items in " + type + ": ");
		if ( items.size() == 0 )
		{
			System.out.print("None\n");
		}
		else
		{
			for ( Item i : items )
			{
				System.out.println("Name: " + i.getName() +  "\nType: " + i.getType() + "\nSku: " + i.getSku() );
				System.out.println();
			}
			
		}
	}

	// Determines number of boxes and which items in each box
	public static List<Box> calculateBoxContents(List<Item> items)
	{
		
		int maxItems = 0;

		if ( items.get(0).getType().equals("Housewares") )
			{
				maxItems = 1;
			} 
			else if ( items.get(0).getType().equals("Shoes") || items.get(0).getType().equals("Bags") )
			{
				maxItems = 3;
			}
			else if ( items.get(0).getType().equals("Hats") || items.get(0).getType().equals("Clothing") || items.get(0).getType().equals("Beauty") )
			{
				maxItems = 4;
			}
			else if ( items.get(0).getType().equals("Accessories") )
			{
				maxItems = 9;
			}

		for (int i = 0; i < items.size(); i += maxItems )
		{
			Box box = new Box();
			System.out.println( "Created New Box");
			for ( int y = i; y < i + maxItems && y < items.size(); y++ )
			{
				box.addItem(items.get(y));
				System.out.println( "add item to box");
			}
			boxes.add(box);
		} 
		System.out.println( "out of for loop");
		return boxes;
		
		
	}

	// Diaplays Box details
	public static void printBoxContents()
	{
		System.out.println( "Number of Boxes needed for this order: " + boxes.size());
		for ( int i = 0; i < boxes.size(); i++ )
		{
			System.out.println( "Contents for Box #" + i );
			for ( Item j : boxes.get(i).getItems() )
			{
				System.out.println( j.getName() + "\n" + j.getType() + "\n" + j.getSku() + "\n");
			}
		}
	}


}











