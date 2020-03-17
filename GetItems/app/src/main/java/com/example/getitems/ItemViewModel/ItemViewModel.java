package com.example.getitems.ItemViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new ItemModel("Butter Knife", "Not really Sharp", 1, 1, 1,"butterknife.png", ItemLocationEnum.OffHand, ItemAttributeEnum.Attack));
        addItem(new ItemModel("Big Bomb", "Don't think, just run!", 0, 0, 2,"bomb.png", ItemLocationEnum.Unknown, ItemAttributeEnum.Attack));
        addItem(new ItemModel("Ray gun", "Eat lasers!", 0, 0, 3,"raygun.png", ItemLocationEnum.PrimaryHand, ItemAttributeEnum.Attack));

    }

    public static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class ItemModel {
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;
        public final ItemLocationEnum Location;
        public final ItemAttributeEnum Attribute;



        public ItemModel(String name, String description, int range,  int damage, int value, String uri, ItemLocationEnum location, ItemAttributeEnum attribute) {
            Name = name;
            Range = range;
            Damage = damage;
            Value = value;
            Description = description;
            ImageURI = uri;
            Location = location;
            Attribute = attribute;

        }

        @Override
        public String toString() { return Name; }
    }
}
