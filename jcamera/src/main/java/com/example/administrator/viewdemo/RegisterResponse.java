package com.example.administrator.viewdemo;

import java.util.List;

/**
 * Created by Administrator on 2019/08/16.
 */

class RegisterResponse {
    private String resultcode;
    private String reason;
    /**
     * result : {"stat":"1","data":[{"uniquekey":"5f235f585a8e2a6e0c4f9d132ee497bc","title":"古代正妻最羡慕小妾这一点，是自己无法得到的特权，独小妾所有","date":"2019-08-16 15:06","category":"头条","author_name":"麻辣历史大讲堂","url":"http://mini.eastday.com/mobile/190816150649633.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190816/2019081614_9bfe7b67e6bb4731852c88873e7c1141_6175_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190816/2019081614_baa9c571500a465f9cbe5bd7d5b9d152_9101_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190816/2019081614_98673835d73a4f08839eace239408be0_8056_mwpm_03200403.jpg"},{"uniquekey":"83f72745f8d0397c5473f2b8ec02881b","title":"柳叶眉的吴谨言、樱桃口的赵雅芝，细数荧屏上那些最具古典美的女星","date":"2019-08-16 15:02","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190816150211356.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_2_mwpm_03200403.jpg"},{"uniquekey":"3454bf2a9fdd73d626c9fe5ccde5a892","title":"场景式消费让北京百货大楼回春 创意让商业街区活跃","date":"2019-08-16 14:58","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190816145840051.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190816/20190816145840_e6b4b58e5c125c9aba3a73f90466bea3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190816/20190816145840_e6b4b58e5c125c9aba3a73f90466bea3_1_mwpm_03200403.jpg"},{"uniquekey":"2699757377170c59704a008087e2e21b","title":"它是洋火姜，人们称它为人参，如今夏天吃得人多","date":"2019-08-16 14:58","category":"头条","author_name":"御花苑","url":"http://mini.eastday.com/mobile/190816145834914.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_206187d78286409d942af009881a37da_7081_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_eb1901c4406f4af3b0a6cd8099eeac25_5870_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/2019081614_fb2975dcf1dc4c2d8f67e62b9c83b9d2_8507_cover_mwpm_03200403.jpg"},{"uniquekey":"abf7e904b916d36db406908cb9820913","title":"关晓彤上完课与同学玩自拍，小伙伴们个个肤白貌美，颜值已上线","date":"2019-08-16 14:55","category":"头条","author_name":"光明日报","url":"http://mini.eastday.com/mobile/190816145535008.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_2_mwpm_03200403.jpg"},{"uniquekey":"e369cd0cbb1d0944e76639a6d23b1b9a","title":"10代索纳塔领衔！ 北京现代明年将推超5款全新车","date":"2019-08-16 14:51","category":"头条","author_name":"华声在线","url":"http://mini.eastday.com/mobile/190816145147130.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_8_mwpm_03200403.jpg"},{"uniquekey":"010c1b5381565fa1bb87a24c87c88701","title":"这些\u201c隐语\u201d只有肯德基员工才知道，点餐时这么说，吃着更爽快","date":"2019-08-16 14:48","category":"头条","author_name":"飞鱼的小食堂","url":"http://mini.eastday.com/mobile/190816144853406.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_4_mwpm_03200403.jpg"},{"uniquekey":"cc9398cecb3038e3c74b5cb50503b113","title":"天呐！七彩炫菊，百年罕见！太美了！","date":"2019-08-16 14:48","category":"头条","author_name":"笑笑美妞","url":"http://mini.eastday.com/mobile/190816144826785.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_26_mwpm_03200403.jpg"},{"uniquekey":"8e875003cffb426ec47a1fcd30276134","title":"痛！痛！痛！消防中队长吕挺救人牺牲","date":"2019-08-16 14:46","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816144604303.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816144604_2ca14696542b9fb2bfc8194993590394_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816144604_2ca14696542b9fb2bfc8194993590394_1_mwpm_03200403.jpg"},{"uniquekey":"f9c24a90c774e15d02a4720435ec01e8","title":"张爸糖尿病却管不住嘴，张歆艺强行限制，袁弘的做法一般人办不到","date":"2019-08-16 14:45","category":"头条","author_name":"自娱自乐12号站","url":"http://mini.eastday.com/mobile/190816144525520.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190816/2019081614_ce3c245392254b2a9f6c325d01bdfcfe_2435_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190816/2019081614_f1f7ff07794640e287a43ff962c2e06d_0519_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190816/2019081614_f5bbd786773643d4b62a80da985fb971_5065_mwpm_03200403.jpg"},{"uniquekey":"893197fc1a30820b6e93ad168cb46bf9","title":"未来半个月，3星座桃花朵朵开，月老牵线，牵手真爱！","date":"2019-08-16 14:45","category":"头条","author_name":"12星座君","url":"http://mini.eastday.com/mobile/190816144522884.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_2_mwpm_03200403.jpg"},{"uniquekey":"e0b5cb91b1ce32102d8df81636e98794","title":"韩国人特意飞到瑞典，向C罗讨要说法ch罗不上场关C罗什么事？","date":"2019-08-16 14:36","category":"头条","author_name":"体坛曾说过","url":"http://mini.eastday.com/mobile/190816143629671.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/20190816143629_de37a962b68c0fd669cfe189ff344bae_1_mwpm_03200403.jpg"},{"uniquekey":"f7b78a3143bc7534d0274221f0f573c7","title":"OPPO紧跟vivo这回不坑了，三摄＋50w快充，接近2000元香啊","date":"2019-08-16 14:36","category":"头条","author_name":"大哥大短讯","url":"http://mini.eastday.com/mobile/190816143622298.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_4_mwpm_03200403.jpg"},{"uniquekey":"517e7501f8cace016613630970f4ece5","title":"国民党将分裂？郭阵营：吴敦义和郭台铭将会面！","date":"2019-08-16 14:35","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190816143553970.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/20190816143553_50152560cee47016b509cb66fa01d446_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/20190816143553_50152560cee47016b509cb66fa01d446_1_mwpm_03200403.jpg"},{"uniquekey":"df3ceb6b9c1da6ace7a50a4119d272c5","title":"郎平骑摩拜逛街！戴口罩背包大长腿很细，背后看显年轻像三十多岁","date":"2019-08-16 14:35","category":"头条","author_name":"体育新鲜事","url":"http://mini.eastday.com/mobile/190816143508736.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_bc14810a27fc479b8b1ce81f3e0a4b10_6020_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_fa9bb171835c4e6c9af9221b0f7744ff_0411_mwpm_03200403.jpg"},{"uniquekey":"936ce665bcab6ed302175809cab1a7a7","title":"72岁伯伯的\"神奇医院\"，专帮人修复童年：每个娃娃都有自己的脾气","date":"2019-08-16 14:35","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190816143506918.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_3_mwpm_03200403.jpg"},{"uniquekey":"bfda488a21a22634b606a84b769c46ed","title":"独家｜上海P2P\u201c新新贷\u201d宣布部分用户无法提现，平台总待收约42亿元","date":"2019-08-16 14:35","category":"头条","author_name":"IT小灵通","url":"http://mini.eastday.com/mobile/190816143502809.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_7_mwpm_03200403.jpg"},{"uniquekey":"c8de37207b63b1b6e2cbf26245554821","title":"湿气重的人，一般有三个陋习，教你除湿方法，有助去除湿气","date":"2019-08-16 14:34","category":"头条","author_name":"游戏联盟君","url":"http://mini.eastday.com/mobile/190816143432616.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/2019081614_09313c2828c147c6bc1213244633dc7a_1084_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190816/2019081614_50e39ab3f0ca4dd890da7a1f45fb49f6_0575_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190816/2019081614_c6f66e22b7294e198c1457749a5cb405_1706_mwpm_03200403.jpg"},{"uniquekey":"ec2248c9057a800ae8a4ec67555c5d88","title":"94岁老人坚持爬山二十年，他的长寿秘诀适合很多人，值得一看","date":"2019-08-16 14:34","category":"头条","author_name":"小咖游戏精选","url":"http://mini.eastday.com/mobile/190816143406151.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190816/2019081614_8476f8b66b9347e7bcc310a5a13d3502_4396_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190816/2019081614_8b7f214243754fc9bad65c9ab6b84eef_9334_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190816/2019081614_a0e20ceaf303464daa878f113f1449e1_1543_mwpm_03200403.jpg"},{"uniquekey":"b8aaba3f533eada87f4934724315653d","title":"国家发改委：1至7月居民消费价格指数平均上涨2.3%","date":"2019-08-16 14:33","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816143328994.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143328_0366c919a445584ad1ab5f2e186616ef_1_mwpm_03200403.jpg"},{"uniquekey":"a185c29c04f4d8356597df236eb62a4c","title":"听老英雄讲故事","date":"2019-08-16 14:27","category":"头条","author_name":"法制网","url":"http://mini.eastday.com/mobile/190816142746171.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190816/20190816142746_2d03bd0e5d2c192c2e31303155181a5e_1_mwpm_03200403.jpg"},{"uniquekey":"6a69884f28234365cc36b5265aecaab4","title":"搞笑段子：跟媳妇儿逛商场出来，看到一靓女用轮椅推着一个小伙子","date":"2019-08-16 14:27","category":"头条","author_name":"网易有料","url":"http://mini.eastday.com/mobile/190816142713154.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_2_mwpm_03200403.jpg"},{"uniquekey":"aaca15dc2655c3d3f5d2fd1cb1b6a226","title":"12星座中谁的\u201c恋爱速度\u201d最快？","date":"2019-08-16 14:26","category":"头条","author_name":"星座细说","url":"http://mini.eastday.com/mobile/190816142610279.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_7486eb4a5e884a0e8df756e6d4a0ca83_4853_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_693edf5380ab486f856f8ce5ccbfd1b7_3745_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/2019081614_3c5ad8833a2c4fb59ac12dd9021f34d5_8366_cover_mwpm_03200403.jpg"},{"uniquekey":"5bc49ca33b0ab8856c04d7584789fee8","title":"搞笑GIF动图：不比了，我认输了还不成吗？姑娘我敬你是条汉子","date":"2019-08-16 14:23","category":"头条","author_name":"全球搞笑基地","url":"http://mini.eastday.com/mobile/190816142348810.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/2019081614_9ac1761aed8042e6a20ecdde9b3f7df2_7212_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190816/2019081614_fdfc578a45ce4cfa9df0dbad5a03454e_1102_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190816/2019081614_7bf494d471644f84830fd412bade96f6_0498_cover_mwpm_03200403.jpg"},{"uniquekey":"8ae094515c881fc6beece4febe0e6d12","title":"女子问禅师：\u201c生活不如意，身边的人和事难以忍受","date":"2019-08-16 14:23","category":"头条","author_name":"想看你的笑","url":"http://mini.eastday.com/mobile/190816142329900.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/2019081614_e90cc6021ee3442c9bd9f8610cf328f7_0678_cover_mwpm_03200403.jpg"},{"uniquekey":"36f1ee37cb8ff59999fab769fc04cef9","title":"9.21南昌汽车房车展：配置齐全功能实用的高性价比国六房车\u2014\u2014七狼B型房车","date":"2019-08-16 14:22","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/190816142249586.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_3_mwpm_03200403.jpg"},{"uniquekey":"48aaf3f945789fe557df13a89ff16e50","title":"街拍小姐姐，美女模特点缀车展，个个都有着女神品质!","date":"2019-08-16 14:22","category":"头条","author_name":"就是仙女范","url":"http://mini.eastday.com/mobile/190816142248413.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/2019081614_70cf34b7c46349aaaedeb2ab956e4a6b_4386_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/2019081614_f78fc724b4734cf9b5cb9b74ad278e1b_9815_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/2019081614_fc2b0a06813840e4929e94381d59e65d_9581_cover_mwpm_03200403.jpg"},{"uniquekey":"871d8e6093899f23057b26c93c2f47b9","title":"和平精英：战神局队友被压空投下，竟然还是天命圈，劝你善良","date":"2019-08-16 14:22","category":"头条","author_name":"王者解说","url":"http://mini.eastday.com/mobile/190816142242545.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_2_mwpm_03200403.jpg"},{"uniquekey":"b4a2d2436d432867345e7fd0ef084421","title":"挽救233人生命！俄一客机遭飞鸟撞击迫降 迫降瞬间画面曝光","date":"2019-08-16 14:21","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816142137719.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_3_mwpm_03200403.jpg"},{"uniquekey":"b5d2bd1090f6cd5a305130fd9afe82de","title":"9月，旧爱上门，死灰复燃，3星座抱得真爱，恩爱如初","date":"2019-08-16 14:21","category":"头条","author_name":"星星的秘密故事","url":"http://mini.eastday.com/mobile/190816142134565.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private ResultBean result;
    private int error_code;

    public RegisterResponse(String resultcode, String reason) {
        this.resultcode = resultcode;
        this.reason = reason;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"5f235f585a8e2a6e0c4f9d132ee497bc","title":"古代正妻最羡慕小妾这一点，是自己无法得到的特权，独小妾所有","date":"2019-08-16 15:06","category":"头条","author_name":"麻辣历史大讲堂","url":"http://mini.eastday.com/mobile/190816150649633.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190816/2019081614_9bfe7b67e6bb4731852c88873e7c1141_6175_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190816/2019081614_baa9c571500a465f9cbe5bd7d5b9d152_9101_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190816/2019081614_98673835d73a4f08839eace239408be0_8056_mwpm_03200403.jpg"},{"uniquekey":"83f72745f8d0397c5473f2b8ec02881b","title":"柳叶眉的吴谨言、樱桃口的赵雅芝，细数荧屏上那些最具古典美的女星","date":"2019-08-16 15:02","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190816150211356.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816150211_4049fbac58c738f3c1655e74c57939d8_2_mwpm_03200403.jpg"},{"uniquekey":"3454bf2a9fdd73d626c9fe5ccde5a892","title":"场景式消费让北京百货大楼回春 创意让商业街区活跃","date":"2019-08-16 14:58","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190816145840051.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190816/20190816145840_e6b4b58e5c125c9aba3a73f90466bea3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190816/20190816145840_e6b4b58e5c125c9aba3a73f90466bea3_1_mwpm_03200403.jpg"},{"uniquekey":"2699757377170c59704a008087e2e21b","title":"它是洋火姜，人们称它为人参，如今夏天吃得人多","date":"2019-08-16 14:58","category":"头条","author_name":"御花苑","url":"http://mini.eastday.com/mobile/190816145834914.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_206187d78286409d942af009881a37da_7081_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_eb1901c4406f4af3b0a6cd8099eeac25_5870_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/2019081614_fb2975dcf1dc4c2d8f67e62b9c83b9d2_8507_cover_mwpm_03200403.jpg"},{"uniquekey":"abf7e904b916d36db406908cb9820913","title":"关晓彤上完课与同学玩自拍，小伙伴们个个肤白貌美，颜值已上线","date":"2019-08-16 14:55","category":"头条","author_name":"光明日报","url":"http://mini.eastday.com/mobile/190816145535008.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816145535_d59993e6674a92084e154c8ee61feafc_2_mwpm_03200403.jpg"},{"uniquekey":"e369cd0cbb1d0944e76639a6d23b1b9a","title":"10代索纳塔领衔！ 北京现代明年将推超5款全新车","date":"2019-08-16 14:51","category":"头条","author_name":"华声在线","url":"http://mini.eastday.com/mobile/190816145147130.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190816/20190816145147_3a2544cf80193a34f5e28bac4d7742a1_8_mwpm_03200403.jpg"},{"uniquekey":"010c1b5381565fa1bb87a24c87c88701","title":"这些\u201c隐语\u201d只有肯德基员工才知道，点餐时这么说，吃着更爽快","date":"2019-08-16 14:48","category":"头条","author_name":"飞鱼的小食堂","url":"http://mini.eastday.com/mobile/190816144853406.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816144853_27c3795bc5649504097f85ef0ef77833_4_mwpm_03200403.jpg"},{"uniquekey":"cc9398cecb3038e3c74b5cb50503b113","title":"天呐！七彩炫菊，百年罕见！太美了！","date":"2019-08-16 14:48","category":"头条","author_name":"笑笑美妞","url":"http://mini.eastday.com/mobile/190816144826785.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190816/20190816144826_62c3bd0087c95f7fe68fd9674410e661_26_mwpm_03200403.jpg"},{"uniquekey":"8e875003cffb426ec47a1fcd30276134","title":"痛！痛！痛！消防中队长吕挺救人牺牲","date":"2019-08-16 14:46","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816144604303.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816144604_2ca14696542b9fb2bfc8194993590394_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816144604_2ca14696542b9fb2bfc8194993590394_1_mwpm_03200403.jpg"},{"uniquekey":"f9c24a90c774e15d02a4720435ec01e8","title":"张爸糖尿病却管不住嘴，张歆艺强行限制，袁弘的做法一般人办不到","date":"2019-08-16 14:45","category":"头条","author_name":"自娱自乐12号站","url":"http://mini.eastday.com/mobile/190816144525520.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190816/2019081614_ce3c245392254b2a9f6c325d01bdfcfe_2435_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190816/2019081614_f1f7ff07794640e287a43ff962c2e06d_0519_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190816/2019081614_f5bbd786773643d4b62a80da985fb971_5065_mwpm_03200403.jpg"},{"uniquekey":"893197fc1a30820b6e93ad168cb46bf9","title":"未来半个月，3星座桃花朵朵开，月老牵线，牵手真爱！","date":"2019-08-16 14:45","category":"头条","author_name":"12星座君","url":"http://mini.eastday.com/mobile/190816144522884.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190816/20190816144522_6623e66938540b53c56f2073408e03b5_2_mwpm_03200403.jpg"},{"uniquekey":"e0b5cb91b1ce32102d8df81636e98794","title":"韩国人特意飞到瑞典，向C罗讨要说法ch罗不上场关C罗什么事？","date":"2019-08-16 14:36","category":"头条","author_name":"体坛曾说过","url":"http://mini.eastday.com/mobile/190816143629671.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/20190816143629_de37a962b68c0fd669cfe189ff344bae_1_mwpm_03200403.jpg"},{"uniquekey":"f7b78a3143bc7534d0274221f0f573c7","title":"OPPO紧跟vivo这回不坑了，三摄＋50w快充，接近2000元香啊","date":"2019-08-16 14:36","category":"头条","author_name":"大哥大短讯","url":"http://mini.eastday.com/mobile/190816143622298.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816143622_3966498bafdc60a08c214f7add912a2f_4_mwpm_03200403.jpg"},{"uniquekey":"517e7501f8cace016613630970f4ece5","title":"国民党将分裂？郭阵营：吴敦义和郭台铭将会面！","date":"2019-08-16 14:35","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190816143553970.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/20190816143553_50152560cee47016b509cb66fa01d446_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/20190816143553_50152560cee47016b509cb66fa01d446_1_mwpm_03200403.jpg"},{"uniquekey":"df3ceb6b9c1da6ace7a50a4119d272c5","title":"郎平骑摩拜逛街！戴口罩背包大长腿很细，背后看显年轻像三十多岁","date":"2019-08-16 14:35","category":"头条","author_name":"体育新鲜事","url":"http://mini.eastday.com/mobile/190816143508736.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_bc14810a27fc479b8b1ce81f3e0a4b10_6020_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_fa9bb171835c4e6c9af9221b0f7744ff_0411_mwpm_03200403.jpg"},{"uniquekey":"936ce665bcab6ed302175809cab1a7a7","title":"72岁伯伯的\"神奇医院\"，专帮人修复童年：每个娃娃都有自己的脾气","date":"2019-08-16 14:35","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190816143506918.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/20190816143506_6abe15c2d5d2f11aa8a32d9e6a51ffcd_3_mwpm_03200403.jpg"},{"uniquekey":"bfda488a21a22634b606a84b769c46ed","title":"独家｜上海P2P\u201c新新贷\u201d宣布部分用户无法提现，平台总待收约42亿元","date":"2019-08-16 14:35","category":"头条","author_name":"IT小灵通","url":"http://mini.eastday.com/mobile/190816143502809.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816143502_47330f5d41256b64cda730378a8dbf47_7_mwpm_03200403.jpg"},{"uniquekey":"c8de37207b63b1b6e2cbf26245554821","title":"湿气重的人，一般有三个陋习，教你除湿方法，有助去除湿气","date":"2019-08-16 14:34","category":"头条","author_name":"游戏联盟君","url":"http://mini.eastday.com/mobile/190816143432616.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/2019081614_09313c2828c147c6bc1213244633dc7a_1084_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190816/2019081614_50e39ab3f0ca4dd890da7a1f45fb49f6_0575_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190816/2019081614_c6f66e22b7294e198c1457749a5cb405_1706_mwpm_03200403.jpg"},{"uniquekey":"ec2248c9057a800ae8a4ec67555c5d88","title":"94岁老人坚持爬山二十年，他的长寿秘诀适合很多人，值得一看","date":"2019-08-16 14:34","category":"头条","author_name":"小咖游戏精选","url":"http://mini.eastday.com/mobile/190816143406151.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190816/2019081614_8476f8b66b9347e7bcc310a5a13d3502_4396_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190816/2019081614_8b7f214243754fc9bad65c9ab6b84eef_9334_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190816/2019081614_a0e20ceaf303464daa878f113f1449e1_1543_mwpm_03200403.jpg"},{"uniquekey":"b8aaba3f533eada87f4934724315653d","title":"国家发改委：1至7月居民消费价格指数平均上涨2.3%","date":"2019-08-16 14:33","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816143328994.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816143328_0366c919a445584ad1ab5f2e186616ef_1_mwpm_03200403.jpg"},{"uniquekey":"a185c29c04f4d8356597df236eb62a4c","title":"听老英雄讲故事","date":"2019-08-16 14:27","category":"头条","author_name":"法制网","url":"http://mini.eastday.com/mobile/190816142746171.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190816/20190816142746_2d03bd0e5d2c192c2e31303155181a5e_1_mwpm_03200403.jpg"},{"uniquekey":"6a69884f28234365cc36b5265aecaab4","title":"搞笑段子：跟媳妇儿逛商场出来，看到一靓女用轮椅推着一个小伙子","date":"2019-08-16 14:27","category":"头条","author_name":"网易有料","url":"http://mini.eastday.com/mobile/190816142713154.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190816/20190816142713_f4c51e32c6942d1543e43e1454a2c651_2_mwpm_03200403.jpg"},{"uniquekey":"aaca15dc2655c3d3f5d2fd1cb1b6a226","title":"12星座中谁的\u201c恋爱速度\u201d最快？","date":"2019-08-16 14:26","category":"头条","author_name":"星座细说","url":"http://mini.eastday.com/mobile/190816142610279.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190816/2019081614_7486eb4a5e884a0e8df756e6d4a0ca83_4853_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190816/2019081614_693edf5380ab486f856f8ce5ccbfd1b7_3745_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190816/2019081614_3c5ad8833a2c4fb59ac12dd9021f34d5_8366_cover_mwpm_03200403.jpg"},{"uniquekey":"5bc49ca33b0ab8856c04d7584789fee8","title":"搞笑GIF动图：不比了，我认输了还不成吗？姑娘我敬你是条汉子","date":"2019-08-16 14:23","category":"头条","author_name":"全球搞笑基地","url":"http://mini.eastday.com/mobile/190816142348810.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190816/2019081614_9ac1761aed8042e6a20ecdde9b3f7df2_7212_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190816/2019081614_fdfc578a45ce4cfa9df0dbad5a03454e_1102_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190816/2019081614_7bf494d471644f84830fd412bade96f6_0498_cover_mwpm_03200403.jpg"},{"uniquekey":"8ae094515c881fc6beece4febe0e6d12","title":"女子问禅师：\u201c生活不如意，身边的人和事难以忍受","date":"2019-08-16 14:23","category":"头条","author_name":"想看你的笑","url":"http://mini.eastday.com/mobile/190816142329900.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190816/2019081614_e90cc6021ee3442c9bd9f8610cf328f7_0678_cover_mwpm_03200403.jpg"},{"uniquekey":"36f1ee37cb8ff59999fab769fc04cef9","title":"9.21南昌汽车房车展：配置齐全功能实用的高性价比国六房车\u2014\u2014七狼B型房车","date":"2019-08-16 14:22","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/190816142249586.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190816/20190816142249_051883bbc363762046f0aaa798fdec2f_3_mwpm_03200403.jpg"},{"uniquekey":"48aaf3f945789fe557df13a89ff16e50","title":"街拍小姐姐，美女模特点缀车展，个个都有着女神品质!","date":"2019-08-16 14:22","category":"头条","author_name":"就是仙女范","url":"http://mini.eastday.com/mobile/190816142248413.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/2019081614_70cf34b7c46349aaaedeb2ab956e4a6b_4386_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/2019081614_f78fc724b4734cf9b5cb9b74ad278e1b_9815_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/2019081614_fc2b0a06813840e4929e94381d59e65d_9581_cover_mwpm_03200403.jpg"},{"uniquekey":"871d8e6093899f23057b26c93c2f47b9","title":"和平精英：战神局队友被压空投下，竟然还是天命圈，劝你善良","date":"2019-08-16 14:22","category":"头条","author_name":"王者解说","url":"http://mini.eastday.com/mobile/190816142242545.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816142242_f1854c1f60fcb6d371e6b177dd64be30_2_mwpm_03200403.jpg"},{"uniquekey":"b4a2d2436d432867345e7fd0ef084421","title":"挽救233人生命！俄一客机遭飞鸟撞击迫降 迫降瞬间画面曝光","date":"2019-08-16 14:21","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/190816142137719.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190816/20190816142137_83585f3bcdfce53689b6750620f32ce7_3_mwpm_03200403.jpg"},{"uniquekey":"b5d2bd1090f6cd5a305130fd9afe82de","title":"9月，旧爱上门，死灰复燃，3星座抱得真爱，恩爱如初","date":"2019-08-16 14:21","category":"头条","author_name":"星星的秘密故事","url":"http://mini.eastday.com/mobile/190816142134565.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190816/20190816142134_67809bfa97560751d32c6c4b8359eb96_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 5f235f585a8e2a6e0c4f9d132ee497bc
             * title : 古代正妻最羡慕小妾这一点，是自己无法得到的特权，独小妾所有
             * date : 2019-08-16 15:06
             * category : 头条
             * author_name : 麻辣历史大讲堂
             * url : http://mini.eastday.com/mobile/190816150649633.html
             * thumbnail_pic_s : http://03imgmini.eastday.com/mobile/20190816/2019081614_9bfe7b67e6bb4731852c88873e7c1141_6175_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03imgmini.eastday.com/mobile/20190816/2019081614_baa9c571500a465f9cbe5bd7d5b9d152_9101_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://03imgmini.eastday.com/mobile/20190816/2019081614_98673835d73a4f08839eace239408be0_8056_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}