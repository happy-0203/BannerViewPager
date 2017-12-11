package com.example.cc.androidbannerviewpager.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cc on 2017/12/9.
 */

public class BannerDataBean {


    /**
     * id : 13024
     * name : Leyou LE-230 5000mAh Li-ion Battery Power Bank
     * minPrice : 49200
     * maxPrice : 49200
     * currency : RP
     * afterSalesPolicy : 12
     * weight : 0.135
     * volume : 16.000cm * 11.000cm * 2.500cm
     * marketPrice : 148000
     * oversold : false
     * minBuy : 1
     * marketable : false
     * salesAttrs : [{"productId":49939,"sku":"0201792702","spec":"White","oversold":false,"stockQuantity":0},{"productId":49942,"sku":"0201792705","spec":"Blue","oversold":false,"stockQuantity":0}]
     * goodsStepPrices : [{"quantity":1,"price":49200}]
     * image : null
     * images : ["https://pic.21chinamall.com/57f76dc7f9de4580a02152895198cbd6.jpg","https://pic.21chinamall.com/236fc0691d004e85b96b5490465a1b2c.jpg","https://pic.21chinamall.com/15216b5fbc3142ed9f13fa35167f98d4.jpg","https://pic.21chinamall.com/ed27383caa304786bc83d2000062f038.jpg","https://pic.21chinamall.com/63c771b2c285454299b17a69dd4eb242.jpg","https://pic.21chinamall.com/1d6150811eb04acbabf78dcf5672ad2e.jpg"]
     * inventory : null
     * desc : <p class="MsoNormal"><span style="font-family:&quot;Arial&quot;,&quot;sans-serif&quot;"></span></p><p style="white-space: normal"><span style="font-family: Arial, sans-serif"></span></p><p>Application: mobile phone, MP3, MP4, tablet PC, camera, navigation, etc., and charging voltage portable within 5 v lithium battery products</p><p>Input DC5V - 1A</p><p>Output DC5V - 1A</p><p>Charging temperature range of 0 ℃ ~ 42 ℃</p><p>Using temperature range - 10 ℃ ~ 42 ℃</p><p>Battery: Lithium battery 3.7 V 5000 mAh</p><p>PC USB charging ：≥5 hours&nbsp;</p><p>Charger :≥5 hours</p><p>Weight(g): 135</p><p>Post-packaging Sizes: 16*11*2.5cm&nbsp;</p><p>Packing List: Power Bank*1, USB Cable*1</p><p>150pcs/Carton</p><p>&nbsp;<img src="http://pic.21chinamall.com/bf/b6/c8/3d279efcb2b599a52a2e76a74457f823597.jpg?1459920523#h"/><br/>&nbsp;<img src="http://pic.21chinamall.com/ea/3f/bf/cbc17a5bbac33f894e1b247cda2eb13ba2f.jpg?1459920523#h"/><br/>&nbsp;&nbsp;<img src="http://pic.21chinamall.com/52/d0/a8/a230a60ce8ec79c6946fa0a70f02ed65f00.jpg?1459920523#h"/><img src="http://pic.21chinamall.com/a3/60/5b/803b65821838b99157ffa3045a7aa80f953.jpg?1459920524#h"/><br/>&nbsp;</p>
     * brand : null
     * typeId : 268
     * availableStock : null
     * categoryLevel1 : null
     * categoryLevel2 : {"id":1014,"name":"Mobile Accessories","parentId":1012,"path":"1012","image":null,"children":[]}
     * categoryLevel3 : {"id":1025,"name":"Power Banks","parentId":1014,"path":"1012,1014","image":null,"children":[]}
     * websiteSettingDTO : {"customerServicePhone":"081288883206","specNotice":"0858 8504 9380"}
     * priceFormat : null
     * marketPriceFormat : null
     * spu : 13024
     * extensionInfoList : [{"Capacity":"3001-5000mAh"},{"Battery Type":"Li-ion"},{"USB Port":"One-USB"},{"Shell Material":"Plastic"},{"Input":"5V-1A"},{"Output":"5V-1A"},{"Applicable to":"Universal"},{"Actual Capacity ":"4000mAh"}]
     * presentList : []
     */

    private int id;
    private String name;
    private int minPrice;
    private int maxPrice;
    private String currency;
    private String afterSalesPolicy;
    private double weight;
    private String volume;
    private int marketPrice;
    private boolean oversold;
    private int minBuy;
    private boolean marketable;
    private Object image;
    private Object inventory;
    private String desc;
    private Object brand;
    private int typeId;
    private Object availableStock;
    private Object categoryLevel1;
    private CategoryLevel2Bean categoryLevel2;
    private CategoryLevel3Bean categoryLevel3;
    private WebsiteSettingDTOBean websiteSettingDTO;
    private Object priceFormat;
    private Object marketPriceFormat;
    private String spu;
    private List<SalesAttrsBean> salesAttrs;
    private List<GoodsStepPricesBean> goodsStepPrices;
    private List<String> images;
    private List<ExtensionInfoListBean> extensionInfoList;
    private List<?> presentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAfterSalesPolicy() {
        return afterSalesPolicy;
    }

    public void setAfterSalesPolicy(String afterSalesPolicy) {
        this.afterSalesPolicy = afterSalesPolicy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public boolean isOversold() {
        return oversold;
    }

    public void setOversold(boolean oversold) {
        this.oversold = oversold;
    }

    public int getMinBuy() {
        return minBuy;
    }

    public void setMinBuy(int minBuy) {
        this.minBuy = minBuy;
    }

    public boolean isMarketable() {
        return marketable;
    }

    public void setMarketable(boolean marketable) {
        this.marketable = marketable;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getInventory() {
        return inventory;
    }

    public void setInventory(Object inventory) {
        this.inventory = inventory;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getBrand() {
        return brand;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Object getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Object availableStock) {
        this.availableStock = availableStock;
    }

    public Object getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Object categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public CategoryLevel2Bean getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(CategoryLevel2Bean categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public CategoryLevel3Bean getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(CategoryLevel3Bean categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public WebsiteSettingDTOBean getWebsiteSettingDTO() {
        return websiteSettingDTO;
    }

    public void setWebsiteSettingDTO(WebsiteSettingDTOBean websiteSettingDTO) {
        this.websiteSettingDTO = websiteSettingDTO;
    }

    public Object getPriceFormat() {
        return priceFormat;
    }

    public void setPriceFormat(Object priceFormat) {
        this.priceFormat = priceFormat;
    }

    public Object getMarketPriceFormat() {
        return marketPriceFormat;
    }

    public void setMarketPriceFormat(Object marketPriceFormat) {
        this.marketPriceFormat = marketPriceFormat;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public List<SalesAttrsBean> getSalesAttrs() {
        return salesAttrs;
    }

    public void setSalesAttrs(List<SalesAttrsBean> salesAttrs) {
        this.salesAttrs = salesAttrs;
    }

    public List<GoodsStepPricesBean> getGoodsStepPrices() {
        return goodsStepPrices;
    }

    public void setGoodsStepPrices(List<GoodsStepPricesBean> goodsStepPrices) {
        this.goodsStepPrices = goodsStepPrices;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<ExtensionInfoListBean> getExtensionInfoList() {
        return extensionInfoList;
    }

    public void setExtensionInfoList(List<ExtensionInfoListBean> extensionInfoList) {
        this.extensionInfoList = extensionInfoList;
    }

    public List<?> getPresentList() {
        return presentList;
    }

    public void setPresentList(List<?> presentList) {
        this.presentList = presentList;
    }

    public static class CategoryLevel2Bean {
        /**
         * id : 1014
         * name : Mobile Accessories
         * parentId : 1012
         * path : 1012
         * image : null
         * children : []
         */

        private int id;
        private String name;
        private int parentId;
        private String path;
        private Object image;
        private List<?> children;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public List<?> getChildren() {
            return children;
        }

        public void setChildren(List<?> children) {
            this.children = children;
        }
    }

    public static class CategoryLevel3Bean {
        /**
         * id : 1025
         * name : Power Banks
         * parentId : 1014
         * path : 1012,1014
         * image : null
         * children : []
         */

        private int id;
        private String name;
        private int parentId;
        private String path;
        private Object image;
        private List<?> children;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public List<?> getChildren() {
            return children;
        }

        public void setChildren(List<?> children) {
            this.children = children;
        }
    }

    public static class WebsiteSettingDTOBean {
        /**
         * customerServicePhone : 081288883206
         * specNotice : 0858 8504 9380
         */

        private String customerServicePhone;
        private String specNotice;

        public String getCustomerServicePhone() {
            return customerServicePhone;
        }

        public void setCustomerServicePhone(String customerServicePhone) {
            this.customerServicePhone = customerServicePhone;
        }

        public String getSpecNotice() {
            return specNotice;
        }

        public void setSpecNotice(String specNotice) {
            this.specNotice = specNotice;
        }
    }

    public static class SalesAttrsBean {
        /**
         * productId : 49939
         * sku : 0201792702
         * spec : White
         * oversold : false
         * stockQuantity : 0
         */

        private int productId;
        private String sku;
        private String spec;
        private boolean oversold;
        private int stockQuantity;

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getSpec() {
            return spec;
        }

        public void setSpec(String spec) {
            this.spec = spec;
        }

        public boolean isOversold() {
            return oversold;
        }

        public void setOversold(boolean oversold) {
            this.oversold = oversold;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }
    }

    public static class GoodsStepPricesBean {
        /**
         * quantity : 1
         * price : 49200
         */

        private int quantity;
        private int price;

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static class ExtensionInfoListBean {
        /**
         * Capacity : 3001-5000mAh
         * Battery Type : Li-ion
         * USB Port : One-USB
         * Shell Material : Plastic
         * Input : 5V-1A
         * Output : 5V-1A
         * Applicable to : Universal
         * Actual Capacity  : 4000mAh
         */

        private String Capacity;
        @SerializedName("Battery Type")
        private String _$BatteryType314; // FIXME check this code
        @SerializedName("USB Port")
        private String _$USBPort129; // FIXME check this code
        @SerializedName("Shell Material")
        private String _$ShellMaterial41; // FIXME check this code
        private String Input;
        private String Output;
        @SerializedName("Applicable to")
        private String _$ApplicableTo4; // FIXME check this code
        @SerializedName("Actual Capacity ")
        private String _$ActualCapacity128; // FIXME check this code

        public String getCapacity() {
            return Capacity;
        }

        public void setCapacity(String Capacity) {
            this.Capacity = Capacity;
        }

        public String get_$BatteryType314() {
            return _$BatteryType314;
        }

        public void set_$BatteryType314(String _$BatteryType314) {
            this._$BatteryType314 = _$BatteryType314;
        }

        public String get_$USBPort129() {
            return _$USBPort129;
        }

        public void set_$USBPort129(String _$USBPort129) {
            this._$USBPort129 = _$USBPort129;
        }

        public String get_$ShellMaterial41() {
            return _$ShellMaterial41;
        }

        public void set_$ShellMaterial41(String _$ShellMaterial41) {
            this._$ShellMaterial41 = _$ShellMaterial41;
        }

        public String getInput() {
            return Input;
        }

        public void setInput(String Input) {
            this.Input = Input;
        }

        public String getOutput() {
            return Output;
        }

        public void setOutput(String Output) {
            this.Output = Output;
        }

        public String get_$ApplicableTo4() {
            return _$ApplicableTo4;
        }

        public void set_$ApplicableTo4(String _$ApplicableTo4) {
            this._$ApplicableTo4 = _$ApplicableTo4;
        }

        public String get_$ActualCapacity128() {
            return _$ActualCapacity128;
        }

        public void set_$ActualCapacity128(String _$ActualCapacity128) {
            this._$ActualCapacity128 = _$ActualCapacity128;
        }
    }
}
