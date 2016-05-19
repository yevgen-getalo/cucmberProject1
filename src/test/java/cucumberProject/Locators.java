package cucumberProject;


public interface Locators {
    //PRODUCTS page
    String CLICK_ON_PRODUCTS_BUTTON = "//*/nav/ul/li[2]";
    String PRODUCTS_PAGE_NAME = "//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_filters']/div/div/h3[span[contains(text(),'Products')]]";
    String PRODUCTS_CATEGORIES = "//*[@id='column-3']";
    String PRODUCTS_LIST = "//*[@id='column-4']";
    //SPECIAL OFFERS page
    String CLICK_ON_SPECAIL_OFFERS_BUTTON = "//*/nav/ul/li[3]";
    String SPECIAL_OFFERS_PAGE_NAME = "//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_filters']/div/div/h3[span[contains(text(),'Special Offers')]]";
    String SPEC_OFFERS_PRODUCTS_LIST = "//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_product-list']";
    String SPEC_OFFERS_PAGINATION_BLOCK = "//*[contains(concat(' ', @class, ' '), 'clearfix lfr-pagination')]";
    String SPEC_OFFERS_LABEL = "//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_product-list']/ul/li/div[1]/div[contains(text(),'Special')]";
    //BLOGS page
    String CLICK_ON_BLOGS_BUTTON = "//a[@href='http://192.168.214.3:8080/blogs']";
    String BLOG_PAGE_NAME = "//*[contains(concat(' ', @class, ' '), 'portlet-title')]/span[1][span[contains(text(),'Blogs')]]";
    String NEWS_LIST = "//*[@id='_33_fm1']";
    String BLOGS_PAGINATION_BLOCK = "//*[contains(concat(' ', @class, ' '), 'clearfix lfr-pagination')]";
    //CONTACT US page
    String CLICK_ON_CONTACT_US_BUTTON = "//*/nav/ul/li[5]";
    String CONTACT_US_PAGE_NAME = ".//*[@id='mapid-527834fd-131c-4939-acbd-bafb0a006e62']/h1[contains(text(),'Contact Us')]";
    String GOOGLE_MAP = "//*[@id='gmapid-527834fd-131c-4939-acbd-bafb0a006e62']";
    String CONTACT_DETAILS = "//*[@id='p_p_id_56_INSTANCE_wrvRLQkiaAQC_']";
    String ADDITIONAL_INFORMATION = "//*[@id='_1_WAR_webformportlet_INSTANCE_hFdBHhjYIdZD_fm']";
    //Mobile stores
    String GOOGLE_PLAY = "//*[@id='wrapper']/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/a[1]/img";
    String APP_STORE = "//*[@id='wrapper']/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/a[2]/img";
    //WELCOME page
    String RIGHT_CAROUSEL_BUTTON = "//*[@id='portlet_PRODUCT_PORTLET_WAR_ict4appsportlet']/div/div/div/div/div[1]/button[2]";
    String LEFT_CAROUSEL_BUTTON = "//*[@id='portlet_PRODUCT_PORTLET_WAR_ict4appsportlet']/div/div/div/div/div[1]/button[1]";
    String CAROUSEL_FIRST_IMAGE = "//div[@data-slick-index='0']";
    String LOCALIZATION = "//*/nav";
    //Current product page
    String CURRENT_PRODUCT_PAGE_NAME = "//*[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_fullPage']/div/h1[span[contains(text(),'Strawberries')]]";
    String PRODUCT_TAG_LINK = "//*[@id='yui_patched_v3_11_0_1_1462966511414_421']/li[a[contains(text(),'Strawberries')]]";
    String NEXT_BUTTON = "//*[@id='p_p_id_56_INSTANCE_2QPO04eJsI3j_']/div/div/div[1]/ul/button[2]";
    //
    String SEARCH_FIELD = "//*[@id='_3_keywords']";
    String SCOPE_FIELD = "//*[@name='_3_selected_scope']";
    //READ MORE PAGE
    String READ_MORE_PAGE_NAME = "//*[@id='portlet_status']/header/h1/span[contains(text(),'Read More About Us')]";



}
