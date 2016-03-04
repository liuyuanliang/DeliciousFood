package model;

import java.util.List;

/**
 * 猜你喜欢实体类
 */
public class YouLoveEntity {

    /**
     * code : 1
     * obj : {"customized":{"title":"猜你喜欢","time":"19:42为您更新","total":4,"data":[{"id":"1658172","title":"红豆莜麦粒粥","titlepic":"http://site.meishij.net/r/245/200/4487745/a4487745_145066238960145.jpg","is_recipe":1},{"id":"1658273","title":"南瓜鸡蛋水饺","titlepic":"http://site.meishij.net/r/30/75/4706280/a4706280_145070278394798.jpg","is_recipe":1},{"id":"1657964","title":"清香蛋饼","titlepic":"http://site.meishij.net/r/189/33/3258439/a3258439_145042708462500.jpg","is_recipe":1},{"id":"1657932","title":"美味西餐-土豆沙","titlepic":"http://site.meishij.net/r/72/104/4151072/a4151072_145041907166417.jpg","is_recipe":1},{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"615697","title":"日式猪排饭","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_94916.jpg","is_recipe":1},{"id":"1615377","title":"香脆辣鸡腿","titlepic":"http://site.meishij.net/r/115/102/588115/a588115_29725.jpg","is_recipe":1},{"id":"1615003","title":"沸腾麻辣蹄","titlepic":"http://site.meishij.net/r/128/78/2269628/a2269628_78738.jpg","is_recipe":1},{"id":"1643579","title":"芒果酸奶奶昔","titlepic":"http://site.meishij.net/r/209/172/1418209/a1418209_143912765565517.jpg","is_recipe":1},{"id":"1643300","title":"卤牛肉风味拌面","titlepic":"http://site.meishij.net/r/09/192/2735509/a2735509_143893173297641.jpg","is_recipe":1},{"id":"615445","title":"红烧肉","titlepic":"http://site.meishij.net/r/153/33/3070903/a3070903_35379.jpg","is_recipe":1},{"id":"612005","title":"久久鸭翅","titlepic":"http://site.meishij.net/r/167/92/2835667/a2835667_93591.jpg","is_recipe":1},{"id":"1617571","title":"香辣鱼头豆腐火锅","titlepic":"http://site.meishij.net/r/84/160/1102584/a1102584_90725.jpg","is_recipe":1},{"id":"610800","title":"时蔬烤鸡腿饭","titlepic":"http://site.meishij.net/r/81/09/1127331/a1127331_86017.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"611340","title":"白肉双丝卷","titlepic":"http://site.meishij.net/r/139/188/1047139/a1047139_97133.jpg","is_recipe":1},{"id":"1657938","title":"炒杂蔬(素)","titlepic":"http://site.meishij.net/r/84/214/5116084/a5116084_145033668307703.jpg","is_recipe":1},{"id":"1657960","title":"番茄肉酱意粉","titlepic":"http://site.meishij.net/r/204/127/3781954/a3781954_145042580763806.jpg","is_recipe":1},{"id":"612414","title":"虾仁鸡蛋卷","titlepic":"http://site.meishij.net/r/130/153/100880/a100880_33882.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1}]},"like_mem_key":"c6dba83944009870f3e61739e385a8b8","time":1456829326}
     */

    private String code;
    /**
     * customized : {"title":"猜你喜欢","time":"19:42为您更新","total":4,"data":[{"id":"1658172","title":"红豆莜麦粒粥","titlepic":"http://site.meishij.net/r/245/200/4487745/a4487745_145066238960145.jpg","is_recipe":1},{"id":"1658273","title":"南瓜鸡蛋水饺","titlepic":"http://site.meishij.net/r/30/75/4706280/a4706280_145070278394798.jpg","is_recipe":1},{"id":"1657964","title":"清香蛋饼","titlepic":"http://site.meishij.net/r/189/33/3258439/a3258439_145042708462500.jpg","is_recipe":1},{"id":"1657932","title":"美味西餐-土豆沙","titlepic":"http://site.meishij.net/r/72/104/4151072/a4151072_145041907166417.jpg","is_recipe":1},{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"615697","title":"日式猪排饭","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_94916.jpg","is_recipe":1},{"id":"1615377","title":"香脆辣鸡腿","titlepic":"http://site.meishij.net/r/115/102/588115/a588115_29725.jpg","is_recipe":1},{"id":"1615003","title":"沸腾麻辣蹄","titlepic":"http://site.meishij.net/r/128/78/2269628/a2269628_78738.jpg","is_recipe":1},{"id":"1643579","title":"芒果酸奶奶昔","titlepic":"http://site.meishij.net/r/209/172/1418209/a1418209_143912765565517.jpg","is_recipe":1},{"id":"1643300","title":"卤牛肉风味拌面","titlepic":"http://site.meishij.net/r/09/192/2735509/a2735509_143893173297641.jpg","is_recipe":1},{"id":"615445","title":"红烧肉","titlepic":"http://site.meishij.net/r/153/33/3070903/a3070903_35379.jpg","is_recipe":1},{"id":"612005","title":"久久鸭翅","titlepic":"http://site.meishij.net/r/167/92/2835667/a2835667_93591.jpg","is_recipe":1},{"id":"1617571","title":"香辣鱼头豆腐火锅","titlepic":"http://site.meishij.net/r/84/160/1102584/a1102584_90725.jpg","is_recipe":1},{"id":"610800","title":"时蔬烤鸡腿饭","titlepic":"http://site.meishij.net/r/81/09/1127331/a1127331_86017.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"611340","title":"白肉双丝卷","titlepic":"http://site.meishij.net/r/139/188/1047139/a1047139_97133.jpg","is_recipe":1},{"id":"1657938","title":"炒杂蔬(素)","titlepic":"http://site.meishij.net/r/84/214/5116084/a5116084_145033668307703.jpg","is_recipe":1},{"id":"1657960","title":"番茄肉酱意粉","titlepic":"http://site.meishij.net/r/204/127/3781954/a3781954_145042580763806.jpg","is_recipe":1},{"id":"612414","title":"虾仁鸡蛋卷","titlepic":"http://site.meishij.net/r/130/153/100880/a100880_33882.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1}]}
     * like_mem_key : c6dba83944009870f3e61739e385a8b8
     * time : 1456829326
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
         * title : 猜你喜欢
         * time : 19:42为您更新
         * total : 4
         * data : [{"id":"1658172","title":"红豆莜麦粒粥","titlepic":"http://site.meishij.net/r/245/200/4487745/a4487745_145066238960145.jpg","is_recipe":1},{"id":"1658273","title":"南瓜鸡蛋水饺","titlepic":"http://site.meishij.net/r/30/75/4706280/a4706280_145070278394798.jpg","is_recipe":1},{"id":"1657964","title":"清香蛋饼","titlepic":"http://site.meishij.net/r/189/33/3258439/a3258439_145042708462500.jpg","is_recipe":1},{"id":"1657932","title":"美味西餐-土豆沙","titlepic":"http://site.meishij.net/r/72/104/4151072/a4151072_145041907166417.jpg","is_recipe":1},{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"615697","title":"日式猪排饭","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_94916.jpg","is_recipe":1},{"id":"1615377","title":"香脆辣鸡腿","titlepic":"http://site.meishij.net/r/115/102/588115/a588115_29725.jpg","is_recipe":1},{"id":"1615003","title":"沸腾麻辣蹄","titlepic":"http://site.meishij.net/r/128/78/2269628/a2269628_78738.jpg","is_recipe":1},{"id":"1643579","title":"芒果酸奶奶昔","titlepic":"http://site.meishij.net/r/209/172/1418209/a1418209_143912765565517.jpg","is_recipe":1},{"id":"1643300","title":"卤牛肉风味拌面","titlepic":"http://site.meishij.net/r/09/192/2735509/a2735509_143893173297641.jpg","is_recipe":1},{"id":"615445","title":"红烧肉","titlepic":"http://site.meishij.net/r/153/33/3070903/a3070903_35379.jpg","is_recipe":1},{"id":"612005","title":"久久鸭翅","titlepic":"http://site.meishij.net/r/167/92/2835667/a2835667_93591.jpg","is_recipe":1},{"id":"1617571","title":"香辣鱼头豆腐火锅","titlepic":"http://site.meishij.net/r/84/160/1102584/a1102584_90725.jpg","is_recipe":1},{"id":"610800","title":"时蔬烤鸡腿饭","titlepic":"http://site.meishij.net/r/81/09/1127331/a1127331_86017.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"611340","title":"白肉双丝卷","titlepic":"http://site.meishij.net/r/139/188/1047139/a1047139_97133.jpg","is_recipe":1},{"id":"1657938","title":"炒杂蔬(素)","titlepic":"http://site.meishij.net/r/84/214/5116084/a5116084_145033668307703.jpg","is_recipe":1},{"id":"1657960","title":"番茄肉酱意粉","titlepic":"http://site.meishij.net/r/204/127/3781954/a3781954_145042580763806.jpg","is_recipe":1},{"id":"612414","title":"虾仁鸡蛋卷","titlepic":"http://site.meishij.net/r/130/153/100880/a100880_33882.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1}]
         */

        private CustomizedEntity customized;
        private String like_mem_key;
        private int time;

        public void setCustomized(CustomizedEntity customized) {
            this.customized = customized;
        }

        public void setLike_mem_key(String like_mem_key) {
            this.like_mem_key = like_mem_key;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public CustomizedEntity getCustomized() {
            return customized;
        }

        public String getLike_mem_key() {
            return like_mem_key;
        }

        public int getTime() {
            return time;
        }

        public static class CustomizedEntity {
            private String title;
            private String time;
            private int total;
            /**
             * id : 1658172
             * title : 红豆莜麦粒粥
             * titlepic : http://site.meishij.net/r/245/200/4487745/a4487745_145066238960145.jpg
             * is_recipe : 1
             */

            private List<DataEntity> data;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public void setData(List<DataEntity> data) {
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

            public List<DataEntity> getData() {
                return data;
            }

            public static class DataEntity {
                private String id;
                private String title;
                private String titlepic;
                private int is_recipe;

                public void setId(String id) {
                    this.id = id;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setTitlepic(String titlepic) {
                    this.titlepic = titlepic;
                }

                public void setIs_recipe(int is_recipe) {
                    this.is_recipe = is_recipe;
                }

                public String getId() {
                    return id;
                }

                public String getTitle() {
                    return title;
                }

                public String getTitlepic() {
                    return titlepic;
                }

                public int getIs_recipe() {
                    return is_recipe;
                }
            }
        }
    }
}
