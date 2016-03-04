package model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2016/2/26.
 */
public class RecommendEntity implements Serializable{

    /**
     * code : 1
     * obj : {"san_can":[{"id":"615505","titlepic":"http://images.meishij.net/p/20160223/41e8a1fd30e402909373bf0f226709ee.jpg","title":"胡辣汤","descr":"各种辣味加在一起，辣味醇郁，汤香扑鼻","click_type":"5","click_obj":"615505","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20141118/72638555f0ed3f15c727be2c725e1cf7_150x150.jpg","fav_num":"33340","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615505\"}}"},{"id":"591249","titlepic":"http://images.meishij.net/p/20160223/1597b8a961bf62eebd6429d207ff04e5.jpg","title":"秘制水煎包","descr":"薄皮大馅好满足，要想吃好还是自己包","click_type":"5","click_obj":"591249","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130329/c4ac0ff2a48868f56b5ad192b9d6bc39_150x150.jpg","fav_num":"20443","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"591249\"}}"},{"id":"1642614","titlepic":"http://images.meishij.net/p/20160223/626d31d005f2fd8542db158c93bdf009.jpg","title":"酱香啤酒卤蛋","descr":"可一次多做一些，放在卤汁中，随吃随取","click_type":"5","click_obj":"1642614","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/09/192/2735509/a2735509_143858420129844.jpg","fav_num":"13399","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1642614\"}}"},{"id":"1632077","titlepic":"http://images.meishij.net/p/20160223/c845205fcfc6db53b4e2c1020640556a.jpg","title":"豆芽肉丝炒粉条","descr":"多种食材汇聚一堂，营养丰富味道鲜美","click_type":"5","click_obj":"1632077","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/158/87/4021908/a4021908_143193041765095.jpg","fav_num":"23428","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1632077\"}}"},{"id":"500056","titlepic":"http://images.meishij.net/p/20160223/41fd679f8e9c4a984cd50325eb8ef1bd.jpg","title":"家常版口水鸡","descr":"鸡肉含有丰富的蛋白质，有滋补养身的作用","click_type":"5","click_obj":"500056","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20120326/e7b2dc09135127635a5f29ea8dba52da_150x150.jpg","fav_num":"15883","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"500056\"}}"},{"id":"185390","titlepic":"http://images.meishij.net/p/20160223/fe42da64ed62c4bad86402c29c89af6d.jpg","title":"炝拌圆白菜","descr":"多吃圆白菜，可增进食欲，促消化预防便秘","click_type":"5","click_obj":"185390","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20100727/bc3aa68a6bab2506ef6a424d0bb4c61c_150x150.jpg","fav_num":"9331","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"185390\"}}"},{"id":"615704","titlepic":"http://images.meishij.net/p/20160223/0af64e266946116c1eb075654fc08480.jpg","title":"蛋挞","descr":"只需要一块钱，就能做出媲美KFC的蛋挞来","click_type":"5","click_obj":"615704","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/237/178/1232237/a1232237_62029.jpg","fav_num":"22406","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615704\"}}"},{"id":"1632318","titlepic":"http://images.meishij.net/p/20160223/cdce3218352ca59765185f91da1dbc75.jpg","title":"巧克力圣代","descr":"牛奶加冰淇淋粉就能做成这道人气甜品","click_type":"5","click_obj":"1632318","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/112/158/2414612/a2414612_143193901813598.jpg","fav_num":"8124","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1632318\"}}"},{"id":"1621906","titlepic":"http://images.meishij.net/p/20160223/98533116e68c1a88b8d5440dd4247f72.jpg","title":"炸薯条","descr":"土豆可保养容颜，经常吃土豆老的慢","click_type":"5","click_obj":"1621906","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/93/209/2677343/a2677343_142444095672073.jpg","fav_num":"13396","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1621906\"}}"},{"id":"591939","titlepic":"http://images.meishij.net/p/20160223/19e544de29ec7657d1285c4e563f0ebf.jpg","title":"菠菜炸酱面","descr":"纯天然蔬菜面条，专对付好\u201c色\u201d的你","click_type":"5","click_obj":"591939","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130419/0628f0e85f413f37afd3ed1877b68b5d_150x150.jpg","fav_num":"12688","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"591939\"}}"},{"id":"19805","titlepic":"http://images.meishij.net/p/20160223/03d9b4e1868eccfb6d6650b63672ce41.jpg","title":"韭菜炒鸡蛋","descr":"春季养阳，可适当多吃升发阳气的食物","click_type":"5","click_obj":"19805","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130502/c8bedbf0c0d0c3a475e554e7f7e4eea2_150x150.jpg","fav_num":"46962","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"19805\"}}"},{"id":"1635005","titlepic":"http://images.meishij.net/p/20160223/4b8bb649506eda974690a95275576ff0.jpg","title":"油焖春笋","descr":"春笋中含有丰富的维生素A，有明目的作用","click_type":"5","click_obj":"1635005","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/147/198/4174647/a4174647_143372838535314.jpg","fav_num":"5054","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1635005\"}}"},{"id":"598792","titlepic":"http://images.meishij.net/p/20160125/ef465adf7e66d68efc883baa96743c2f.jpg","title":"麻酱拌馄饨","descr":"芝麻酱是日常食物中含钙量最高的，可常食用","click_type":"5","click_obj":"598792","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20131107/e8aa7fbcc4622df7b55c44036471aa19_150x150.jpg","fav_num":"19287","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"598792\"}}"},{"id":"1634624","titlepic":"http://images.meishij.net/p/20160223/dfaadf5644180e8a28771205efe79869.jpg","title":"蛋煎饺子","descr":"速冻或煮熟的饺子，都可以用来做，超简单","click_type":"5","click_obj":"1634624","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/185/123/1655935/a1655935_83463.jpg","fav_num":"18602","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1634624\"}}"},{"id":"609938","titlepic":"http://images.meishij.net/p/20160113/4adb21abbab826d0924c37b0493e47f3.jpg","title":"酱油炒饭","descr":"提前用酱油把米饭拌一下，颜色就会很均匀了","click_type":"5","click_obj":"609938","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/23/28/69523/a69523_13997.jpg","fav_num":"18388","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"609938\"}}"}],"san_can_titles":[{"title":"早餐","sub_title":"好吃到停不下来的水煎包","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"30分钟成就一桌菜","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"自制KFC经典美食","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"品尝春天的味道","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"夜猫子的深夜食堂","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}],"fenlei":[{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}],"func1":{"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"},"func2":{"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"},"top3":[{"photo":"https://dn-mdpic.qbox.me/pic/201602/17/GspBIpWCYgYGOVC_701298798.jpg","click_type":"4","click_obj":"wmf;http://i.meishi.cc/g/transit.php?ename=1432&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1432&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201512/29/OINydXbRTeGZcts_1457668352.jpg","click_type":"4","click_obj":"幸福生活;http://m.meishij.net/huodong/zt.php?zt_id=44from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=44&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201511/19/WxFJICxFdIqDvnu_682560962.png","click_type":"4","click_obj":"秋梨膏;http://m.meishij.net/huodong/zt.php?zt_id=13&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=13&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201601/15/kWbKoTaWOYuAZwQ_2615140813.jpg","click_type":"4","click_obj":"饺子;http://m.meishij.net/huodong/zt.php?zt_id=41&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=41&from=mobile_mobile\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\"}}"}],"top4":[{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\"}}"}],"shops":[{"id":"780","title":"COOK100烤肉腌料6包","price":"17.8","guige":"6袋","image":"http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"780\",\"sourceContent\":\"index\"}}"},{"id":"1081","title":"俏侬牛油蛋挞皮16个装","price":"14.8","guige":"16个","image":"http://site.meishij.net/shop/uploadfile/20160225/20160225140458.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1081\",\"sourceContent\":\"index\"}}"},{"id":"716","title":"欧美特全自动分体保温养生壶","price":"99","guige":"1台","image":"http://site.meishij.net/shop/uploadfile/20151113/20151113120504.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"716\",\"sourceContent\":\"index\"}}"},{"id":"1188","title":"花香大麦茶(粉玫瑰配大麦) ","price":"39","guige":"1盒","image":"http://site.meishij.net/shop/uploadfile/20160205/20160205104550.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1188\",\"sourceContent\":\"index\"}}"}],"zt":[{"id":"7965698","title":"春季养肝正当时","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=83","photo":"http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=83\"}}"},{"id":"7794782","title":"掐一把嫩芽撩拨春天","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=82","photo":"http://images.meishij.net/p/20160219/b9d38161b6c4e3ca2eaead4db0fea907.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=82\"}}"},{"id":"6714014","title":"中式甜品的倾城之美","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong.php?hd=20151014_tiandian","photo":"http://images.meishij.net/p/20160219/4e598df01efa383cf5b95b89df4c306d.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong.php?hd=20151014_tiandian\"}}"}],"customized":{"title":"猜你喜欢","time":"17:41为您更新","total":4,"data":[]}}
     */

    private String code;
    /**
     * san_can : [{"id":"615505","titlepic":"http://images.meishij.net/p/20160223/41e8a1fd30e402909373bf0f226709ee.jpg","title":"胡辣汤","descr":"各种辣味加在一起，辣味醇郁，汤香扑鼻","click_type":"5","click_obj":"615505","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20141118/72638555f0ed3f15c727be2c725e1cf7_150x150.jpg","fav_num":"33340","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615505\"}}"},{"id":"591249","titlepic":"http://images.meishij.net/p/20160223/1597b8a961bf62eebd6429d207ff04e5.jpg","title":"秘制水煎包","descr":"薄皮大馅好满足，要想吃好还是自己包","click_type":"5","click_obj":"591249","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130329/c4ac0ff2a48868f56b5ad192b9d6bc39_150x150.jpg","fav_num":"20443","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"591249\"}}"},{"id":"1642614","titlepic":"http://images.meishij.net/p/20160223/626d31d005f2fd8542db158c93bdf009.jpg","title":"酱香啤酒卤蛋","descr":"可一次多做一些，放在卤汁中，随吃随取","click_type":"5","click_obj":"1642614","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/09/192/2735509/a2735509_143858420129844.jpg","fav_num":"13399","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1642614\"}}"},{"id":"1632077","titlepic":"http://images.meishij.net/p/20160223/c845205fcfc6db53b4e2c1020640556a.jpg","title":"豆芽肉丝炒粉条","descr":"多种食材汇聚一堂，营养丰富味道鲜美","click_type":"5","click_obj":"1632077","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/158/87/4021908/a4021908_143193041765095.jpg","fav_num":"23428","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1632077\"}}"},{"id":"500056","titlepic":"http://images.meishij.net/p/20160223/41fd679f8e9c4a984cd50325eb8ef1bd.jpg","title":"家常版口水鸡","descr":"鸡肉含有丰富的蛋白质，有滋补养身的作用","click_type":"5","click_obj":"500056","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20120326/e7b2dc09135127635a5f29ea8dba52da_150x150.jpg","fav_num":"15883","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"500056\"}}"},{"id":"185390","titlepic":"http://images.meishij.net/p/20160223/fe42da64ed62c4bad86402c29c89af6d.jpg","title":"炝拌圆白菜","descr":"多吃圆白菜，可增进食欲，促消化预防便秘","click_type":"5","click_obj":"185390","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20100727/bc3aa68a6bab2506ef6a424d0bb4c61c_150x150.jpg","fav_num":"9331","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"185390\"}}"},{"id":"615704","titlepic":"http://images.meishij.net/p/20160223/0af64e266946116c1eb075654fc08480.jpg","title":"蛋挞","descr":"只需要一块钱，就能做出媲美KFC的蛋挞来","click_type":"5","click_obj":"615704","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/237/178/1232237/a1232237_62029.jpg","fav_num":"22406","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615704\"}}"},{"id":"1632318","titlepic":"http://images.meishij.net/p/20160223/cdce3218352ca59765185f91da1dbc75.jpg","title":"巧克力圣代","descr":"牛奶加冰淇淋粉就能做成这道人气甜品","click_type":"5","click_obj":"1632318","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/112/158/2414612/a2414612_143193901813598.jpg","fav_num":"8124","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1632318\"}}"},{"id":"1621906","titlepic":"http://images.meishij.net/p/20160223/98533116e68c1a88b8d5440dd4247f72.jpg","title":"炸薯条","descr":"土豆可保养容颜，经常吃土豆老的慢","click_type":"5","click_obj":"1621906","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/93/209/2677343/a2677343_142444095672073.jpg","fav_num":"13396","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1621906\"}}"},{"id":"591939","titlepic":"http://images.meishij.net/p/20160223/19e544de29ec7657d1285c4e563f0ebf.jpg","title":"菠菜炸酱面","descr":"纯天然蔬菜面条，专对付好\u201c色\u201d的你","click_type":"5","click_obj":"591939","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130419/0628f0e85f413f37afd3ed1877b68b5d_150x150.jpg","fav_num":"12688","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"591939\"}}"},{"id":"19805","titlepic":"http://images.meishij.net/p/20160223/03d9b4e1868eccfb6d6650b63672ce41.jpg","title":"韭菜炒鸡蛋","descr":"春季养阳，可适当多吃升发阳气的食物","click_type":"5","click_obj":"19805","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130502/c8bedbf0c0d0c3a475e554e7f7e4eea2_150x150.jpg","fav_num":"46962","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"19805\"}}"},{"id":"1635005","titlepic":"http://images.meishij.net/p/20160223/4b8bb649506eda974690a95275576ff0.jpg","title":"油焖春笋","descr":"春笋中含有丰富的维生素A，有明目的作用","click_type":"5","click_obj":"1635005","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/147/198/4174647/a4174647_143372838535314.jpg","fav_num":"5054","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1635005\"}}"},{"id":"598792","titlepic":"http://images.meishij.net/p/20160125/ef465adf7e66d68efc883baa96743c2f.jpg","title":"麻酱拌馄饨","descr":"芝麻酱是日常食物中含钙量最高的，可常食用","click_type":"5","click_obj":"598792","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20131107/e8aa7fbcc4622df7b55c44036471aa19_150x150.jpg","fav_num":"19287","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"598792\"}}"},{"id":"1634624","titlepic":"http://images.meishij.net/p/20160223/dfaadf5644180e8a28771205efe79869.jpg","title":"蛋煎饺子","descr":"速冻或煮熟的饺子，都可以用来做，超简单","click_type":"5","click_obj":"1634624","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/185/123/1655935/a1655935_83463.jpg","fav_num":"18602","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1634624\"}}"},{"id":"609938","titlepic":"http://images.meishij.net/p/20160113/4adb21abbab826d0924c37b0493e47f3.jpg","title":"酱油炒饭","descr":"提前用酱油把米饭拌一下，颜色就会很均匀了","click_type":"5","click_obj":"609938","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/23/28/69523/a69523_13997.jpg","fav_num":"18388","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"609938\"}}"}]
     * san_can_titles : [{"title":"早餐","sub_title":"好吃到停不下来的水煎包","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"30分钟成就一桌菜","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"自制KFC经典美食","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"品尝春天的味道","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"夜猫子的深夜食堂","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}]
     * fenlei : [{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}]
     * func1 : {"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"}
     * func2 : {"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"}
     * top3 : [{"photo":"https://dn-mdpic.qbox.me/pic/201602/17/GspBIpWCYgYGOVC_701298798.jpg","click_type":"4","click_obj":"wmf;http://i.meishi.cc/g/transit.php?ename=1432&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1432&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201512/29/OINydXbRTeGZcts_1457668352.jpg","click_type":"4","click_obj":"幸福生活;http://m.meishij.net/huodong/zt.php?zt_id=44from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=44&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201511/19/WxFJICxFdIqDvnu_682560962.png","click_type":"4","click_obj":"秋梨膏;http://m.meishij.net/huodong/zt.php?zt_id=13&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=13&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201601/15/kWbKoTaWOYuAZwQ_2615140813.jpg","click_type":"4","click_obj":"饺子;http://m.meishij.net/huodong/zt.php?zt_id=41&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=41&from=mobile_mobile\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\"}}"}]
     * top4 : [{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\"}}"}]
     * shops : [{"id":"780","title":"COOK100烤肉腌料6包","price":"17.8","guige":"6袋","image":"http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"780\",\"sourceContent\":\"index\"}}"},{"id":"1081","title":"俏侬牛油蛋挞皮16个装","price":"14.8","guige":"16个","image":"http://site.meishij.net/shop/uploadfile/20160225/20160225140458.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1081\",\"sourceContent\":\"index\"}}"},{"id":"716","title":"欧美特全自动分体保温养生壶","price":"99","guige":"1台","image":"http://site.meishij.net/shop/uploadfile/20151113/20151113120504.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"716\",\"sourceContent\":\"index\"}}"},{"id":"1188","title":"花香大麦茶(粉玫瑰配大麦) ","price":"39","guige":"1盒","image":"http://site.meishij.net/shop/uploadfile/20160205/20160205104550.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1188\",\"sourceContent\":\"index\"}}"}]
     * zt : [{"id":"7965698","title":"春季养肝正当时","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=83","photo":"http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=83\"}}"},{"id":"7794782","title":"掐一把嫩芽撩拨春天","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=82","photo":"http://images.meishij.net/p/20160219/b9d38161b6c4e3ca2eaead4db0fea907.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=82\"}}"},{"id":"6714014","title":"中式甜品的倾城之美","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong.php?hd=20151014_tiandian","photo":"http://images.meishij.net/p/20160219/4e598df01efa383cf5b95b89df4c306d.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong.php?hd=20151014_tiandian\"}}"}]
     * customized : {"title":"猜你喜欢","time":"17:41为您更新","total":4,"data":[]}
     */

    private ObjEntity obj;

    public void setCode(String code) {
        this.code = code;
    }

    public void setObj(ObjEntity obj) {
        this.obj = obj;
    }

    public String getCode() {
        return code;
    }

    public ObjEntity getObj() {
        return obj;
    }

    public static class ObjEntity {
        /**
         * title : 最受欢迎
         * image : http://static.meishij.net/wap6/images/v6/paihangbang.png
         */

        private Func1Entity func1;
        /**
         * title : 食材组菜
         * image : http://static.meishij.net/wap6/images/v6/zhinengzucai.png
         */

        private Func2Entity func2;
        /**
         * title : 猜你喜欢
         * time : 17:41为您更新
         * total : 4
         * data : []
         */

        private CustomizedEntity customized;
        /**
         * id : 615505
         * titlepic : http://images.meishij.net/p/20160223/41e8a1fd30e402909373bf0f226709ee.jpg
         * title : 胡辣汤
         * descr : 各种辣味加在一起，辣味醇郁，汤香扑鼻
         * click_type : 5
         * click_obj : 615505
         * pv_trackingURL :
         * click_trackingURL :
         * sft : 0
         * is_recipe : 1
         * is_tj : 1
         * tj_img : http://images.meishij.net/p/20141118/72638555f0ed3f15c727be2c725e1cf7_150x150.jpg
         * fav_num : 33340
         * jump : {"type":"5","class_name":"MSRecipeDetailController","property":{"recipeId":"615505"}}
         */

        private List<SanCanEntity> san_can;
        /**
         * title : 早餐
         * sub_title : 好吃到停不下来的水煎包
         * titlepic : http://i5.meishij.net/app/mobile/guyu_icon_1.png
         * click_type : 0
         * click_obj :
         * pv_trackingURL :
         * click_trackingURL :
         */

        private List<SanCanTitlesEntity> san_can_titles;
        /**
         * title : 菜谱分类
         * image : http://static.meishij.net/wap6/images/v6/quanbu.png
         * click_type : 24
         * click_obj : 全部菜谱
         * jump : {"type":"24","class_name":"MSCategoryController","property":{}}
         */

        private List<FenleiEntity> fenlei;
        /**
         * photo : https://dn-mdpic.qbox.me/pic/201602/17/GspBIpWCYgYGOVC_701298798.jpg
         * click_type : 4
         * click_obj : wmf;http://i.meishi.cc/g/transit.php?ename=1432&from=mobile_mobile
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"4","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/i.meishi.cc\/g\/transit.php?ename=1432&from=mobile_mobile"}}
         */

        private List<Top3Entity> top3;
        /**
         * photo : http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg
         * click_type : 5
         * click_obj : 1639954
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"51","class_name":"MSArticleDetailController","property":{"recipeId":"1639954"}}
         */

        private List<Top4Entity> top4;
        /**
         * id : 780
         * title : COOK100烤肉腌料6包
         * price : 17.8
         * guige : 6袋
         * image : http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg
         * jump : {"type":"10","class_name":"MSBuyGoodsDetailController","property":{"goodsID":"780","sourceContent":"index"}}
         */

        private List<ShopsEntity> shops;
        /**
         * id : 7965698
         * title : 春季养肝正当时
         * type : 1
         * tj_type : 0
         * f_s_type : http://m.meishij.net/huodong/zt.php?zt_id=83
         * photo : http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg
         * descr :
         * jump : {"type":"103","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/m.meishij.net\/huodong\/zt.php?zt_id=83"}}
         */

        private List<ZtEntity> zt;

        public void setFunc1(Func1Entity func1) {
            this.func1 = func1;
        }

        public void setFunc2(Func2Entity func2) {
            this.func2 = func2;
        }

        public void setCustomized(CustomizedEntity customized) {
            this.customized = customized;
        }

        public void setSan_can(List<SanCanEntity> san_can) {
            this.san_can = san_can;
        }

        public void setSan_can_titles(List<SanCanTitlesEntity> san_can_titles) {
            this.san_can_titles = san_can_titles;
        }

        public void setFenlei(List<FenleiEntity> fenlei) {
            this.fenlei = fenlei;
        }

        public void setTop3(List<Top3Entity> top3) {
            this.top3 = top3;
        }

        public void setTop4(List<Top4Entity> top4) {
            this.top4 = top4;
        }

        public void setShops(List<ShopsEntity> shops) {
            this.shops = shops;
        }

        public void setZt(List<ZtEntity> zt) {
            this.zt = zt;
        }

        public Func1Entity getFunc1() {
            return func1;
        }

        public Func2Entity getFunc2() {
            return func2;
        }

        public CustomizedEntity getCustomized() {
            return customized;
        }

        public List<SanCanEntity> getSan_can() {
            return san_can;
        }

        public List<SanCanTitlesEntity> getSan_can_titles() {
            return san_can_titles;
        }

        public List<FenleiEntity> getFenlei() {
            return fenlei;
        }

        public List<Top3Entity> getTop3() {
            return top3;
        }

        public List<Top4Entity> getTop4() {
            return top4;
        }

        public List<ShopsEntity> getShops() {
            return shops;
        }

        public List<ZtEntity> getZt() {
            return zt;
        }

        public static class Func1Entity {
            private String title;
            private String image;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }
        }

        public static class Func2Entity {
            private String title;
            private String image;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }
        }

        public static class CustomizedEntity {
            private String title;
            private String time;
            private int total;
            private List<?> data;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public void setData(List<?> data) {
                this.data = data;
            }

            public String getTitle() {
                return title;
            }

            public String getTime() {
                return time;
            }

            public int getTotal() {
                return total;
            }

            public List<?> getData() {
                return data;
            }
        }

        public static class SanCanEntity {
            private String id;
            private String titlepic;
            private String title;
            private String descr;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String sft;
            private String is_recipe;
            private String is_tj;
            private String tj_img;
            private String fav_num;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setIs_tj(String is_tj) {
                this.is_tj = is_tj;
            }

            public void setTj_img(String tj_img) {
                this.tj_img = tj_img;
            }

            public void setFav_num(String fav_num) {
                this.fav_num = fav_num;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public String getTitle() {
                return title;
            }

            public String getDescr() {
                return descr;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getSft() {
                return sft;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getIs_tj() {
                return is_tj;
            }

            public String getTj_img() {
                return tj_img;
            }

            public String getFav_num() {
                return fav_num;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class SanCanTitlesEntity {
            private String title;
            private String sub_title;
            private String titlepic;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public String getTitle() {
                return title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }
        }

        public static class FenleiEntity {
            private String title;
            private String image;
            private String click_type;
            private String click_obj;
            private String jump;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class Top3Entity {
            private String photo;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getPhoto() {
                return photo;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class Top4Entity {
            private String photo;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getPhoto() {
                return photo;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class ShopsEntity {
            private String id;
            private String title;
            private String price;
            private String guige;
            private String image;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public void setGuige(String guige) {
                this.guige = guige;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getPrice() {
                return price;
            }

            public String getGuige() {
                return guige;
            }

            public String getImage() {
                return image;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class ZtEntity {
            private String id;
            private String title;
            private String type;
            private String tj_type;
            private String f_s_type;
            private String photo;
            private String descr;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setTj_type(String tj_type) {
                this.tj_type = tj_type;
            }

            public void setF_s_type(String f_s_type) {
                this.f_s_type = f_s_type;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getType() {
                return type;
            }

            public String getTj_type() {
                return tj_type;
            }

            public String getF_s_type() {
                return f_s_type;
            }

            public String getPhoto() {
                return photo;
            }

            public String getDescr() {
                return descr;
            }

            public String getJump() {
                return jump;
            }
        }
    }
}
