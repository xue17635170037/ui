package com.example.administrator.viewdemo;

/**
 * Created by Administrator on 2019/08/16.
 */

public class LoginResponse {

    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"27","wind_direction":"东北风","wind_strength":"3级","humidity":"35%","time":"15:25"},"today":{"temperature":"13℃~29℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","city":"太原","date_y":"2019年08月16日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20190816":{"temperature":"13℃~29℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","date":"20190816"},"day_20190817":{"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期六","date":"20190817"},"day_20190818":{"temperature":"17℃~31℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东南风微风","week":"星期日","date":"20190818"},"day_20190819":{"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期一","date":"20190819"},"day_20190820":{"temperature":"21℃~32℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"南风微风","week":"星期二","date":"20190820"},"day_20190821":{"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期三","date":"20190821"},"day_20190822":{"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期四","date":"20190822"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

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
         * sk : {"temp":"27","wind_direction":"东北风","wind_strength":"3级","humidity":"35%","time":"15:25"}
         * today : {"temperature":"13℃~29℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","city":"太原","date_y":"2019年08月16日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20190816":{"temperature":"13℃~29℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","date":"20190816"},"day_20190817":{"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期六","date":"20190817"},"day_20190818":{"temperature":"17℃~31℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东南风微风","week":"星期日","date":"20190818"},"day_20190819":{"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期一","date":"20190819"},"day_20190820":{"temperature":"21℃~32℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"南风微风","week":"星期二","date":"20190820"},"day_20190821":{"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期三","date":"20190821"},"day_20190822":{"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期四","date":"20190822"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            /**
             * temp : 27
             * wind_direction : 东北风
             * wind_strength : 3级
             * humidity : 35%
             * time : 15:25
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            /**
             * temperature : 13℃~29℃
             * weather : 晴
             * weather_id : {"fa":"00","fb":"00"}
             * wind : 北风3-5级
             * week : 星期五
             * city : 太原
             * date_y : 2019年08月16日
             * dressing_index : 热
             * dressing_advice : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
             * uv_index : 强
             * comfort_index :
             * wash_index : 较适宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 00
                 * fb : 00
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20190816 : {"temperature":"13℃~29℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"北风3-5级","week":"星期五","date":"20190816"}
             * day_20190817 : {"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期六","date":"20190817"}
             * day_20190818 : {"temperature":"17℃~31℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东南风微风","week":"星期日","date":"20190818"}
             * day_20190819 : {"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期一","date":"20190819"}
             * day_20190820 : {"temperature":"21℃~32℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"南风微风","week":"星期二","date":"20190820"}
             * day_20190821 : {"temperature":"14℃~31℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风微风","week":"星期三","date":"20190821"}
             * day_20190822 : {"temperature":"20℃~33℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"南风微风","week":"星期四","date":"20190822"}
             */

            private Day20190816Bean day_20190816;
            private Day20190817Bean day_20190817;
            private Day20190818Bean day_20190818;
            private Day20190819Bean day_20190819;
            private Day20190820Bean day_20190820;
            private Day20190821Bean day_20190821;
            private Day20190822Bean day_20190822;

            public Day20190816Bean getDay_20190816() {
                return day_20190816;
            }

            public void setDay_20190816(Day20190816Bean day_20190816) {
                this.day_20190816 = day_20190816;
            }

            public Day20190817Bean getDay_20190817() {
                return day_20190817;
            }

            public void setDay_20190817(Day20190817Bean day_20190817) {
                this.day_20190817 = day_20190817;
            }

            public Day20190818Bean getDay_20190818() {
                return day_20190818;
            }

            public void setDay_20190818(Day20190818Bean day_20190818) {
                this.day_20190818 = day_20190818;
            }

            public Day20190819Bean getDay_20190819() {
                return day_20190819;
            }

            public void setDay_20190819(Day20190819Bean day_20190819) {
                this.day_20190819 = day_20190819;
            }

            public Day20190820Bean getDay_20190820() {
                return day_20190820;
            }

            public void setDay_20190820(Day20190820Bean day_20190820) {
                this.day_20190820 = day_20190820;
            }

            public Day20190821Bean getDay_20190821() {
                return day_20190821;
            }

            public void setDay_20190821(Day20190821Bean day_20190821) {
                this.day_20190821 = day_20190821;
            }

            public Day20190822Bean getDay_20190822() {
                return day_20190822;
            }

            public void setDay_20190822(Day20190822Bean day_20190822) {
                this.day_20190822 = day_20190822;
            }

            public static class Day20190816Bean {
                /**
                 * temperature : 13℃~29℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 北风3-5级
                 * week : 星期五
                 * date : 20190816
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 00
                     * fb : 00
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190817Bean {
                /**
                 * temperature : 14℃~31℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 南风微风
                 * week : 星期六
                 * date : 20190817
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 00
                     * fb : 00
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190818Bean {
                /**
                 * temperature : 17℃~31℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 东南风微风
                 * week : 星期日
                 * date : 20190818
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190819Bean {
                /**
                 * temperature : 20℃~33℃
                 * weather : 多云转小雨
                 * weather_id : {"fa":"01","fb":"07"}
                 * wind : 南风微风
                 * week : 星期一
                 * date : 20190819
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 01
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190820Bean {
                /**
                 * temperature : 21℃~32℃
                 * weather : 小雨转阴
                 * weather_id : {"fa":"07","fb":"02"}
                 * wind : 南风微风
                 * week : 星期二
                 * date : 20190820
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 07
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190821Bean {
                /**
                 * temperature : 14℃~31℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 南风微风
                 * week : 星期三
                 * date : 20190821
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 00
                     * fb : 00
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190822Bean {
                /**
                 * temperature : 20℃~33℃
                 * weather : 多云转小雨
                 * weather_id : {"fa":"01","fb":"07"}
                 * wind : 南风微风
                 * week : 星期四
                 * date : 20190822
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 01
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
