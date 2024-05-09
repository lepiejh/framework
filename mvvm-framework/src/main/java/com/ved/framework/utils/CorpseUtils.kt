package com.ved.framework.utils

import android.app.Activity
import android.view.View
import android.widget.TextView

object CorpseUtils {
    fun remove(s: String?): String? = s?.replace("[\r\n]".toRegex(), "")?.replace(" ", "")

    fun first(s:String?) : String{
        s?.let {
            if (it.contains(".")){
                return it.split(".")[0]
            }else{
                return it
            }
        } ?: kotlin.run {
            return ""
        }
    }


    /**
     * 获取最大值
     */
    fun findMax(list: List<Int?>): Int? {
        return list.sortedWith(compareBy { it }).last()
    }

    fun makeTime(t:Int?) : String?{
        t?.let {
            if (it >= 10){
                return StringUtils.parseStr(it)
            }else{
                return "0${it}"
            }
        } ?: kotlin.run {
            return ""
        }
    }

    fun countChar(str: String, ch: Char): Int {
        // 将字符串转换为字符数组
        val chs = str.toCharArray()
        // 定义变量count存储字符串出现的次数
        var count = 0
        for (i in chs.indices) {
            if (chs[i] == ch) {
                count++
            }
        }
        return count
    }

    fun split(s:String) : Int{
        val str = s.split(".")
        val ss = str.getOrNull(1)
        return if (ss?.isNotEmpty() == true){
            ss.length
        }else{
            0
        }
    }

    fun parseEnglishName(name: String) = when (name) {
        "中国" -> "China"
        "阿富汗" -> "Afghanistan"
        "阿尔巴尼亚" -> "Albania"
        "阿尔及利亚" -> "Algeria"
        "美国萨摩亚" -> "American Samoa"
        "安道尔" -> "Andorra"
        "安哥拉" -> "Angola"
        "安圭拉（英）" -> "Anguilla"
        "安提瓜和巴布达" -> "Antigua and Barbuda"
        "阿根廷" -> "Argentina"
        "亚美尼亚" -> "Armenia"
        "阿鲁巴" -> "Aruba"
        "澳大利亚" -> "Australia"
        "奥地利" -> "Austria"
        "阿塞拜疆" -> "Azerbaijan"
        "伯利兹" -> "BELIZE"
        "巴哈马" -> "Bahamas"
        "巴林" -> "Bahrain"
        "孟加拉国" -> "Bangladesh"
        "巴巴多斯" -> "Barbados"
        "白俄罗斯" -> "Belarus"
        "比利时" -> "Belgium"
        "贝宁" -> "Benin"
        "百慕大群岛（英）" -> "Bermuda"
        "不丹" -> "Bhutan"
        "玻利维亚" -> "Bolivia"
        "波斯尼亚和黑塞哥维那" -> "Bosnia and Herzegovina"
        "博茨瓦纳" -> "Botswana"
        "巴西" -> "Brazil"
        "文莱" -> "Brunei"
        "保加利亚" -> "Bulgaria"
        "布基纳法索" -> "Burkina Faso"
        "布隆迪" -> "Burundi"
        "柬埔寨" -> "Cambodia"
        "喀麦隆" -> "Cameroon"
        "加拿大" -> "Canada"
        "佛得角" -> "Cape Verde"
        "开曼群岛（英）" -> "Cayman Islands"
        "中非共和国" -> "Central African Republic"
        "乍得" -> "Chad"
        "智利" -> "Chile"
        "哥伦比亚" -> "Colombia"
        "科摩罗" -> "Comoros"
        "刚果" -> "Congo"
        "刚果金" -> "Congo D.R."
        "库克群岛" -> "Cook Islands"
        "哥斯达黎加" -> "Costa Rica"
        "科特迪瓦" -> "Cote dIvoire"
        "克罗地亚" -> "Croatia"
        "古巴" -> "Cuba"
        "塞浦路斯" -> "Cyprus"
        "捷克" -> "Czech"
        "丹麦" -> "Denmark"
        "迭戈加西亚" -> "Diego Garcia"
        "吉布提" -> "Djibouti"
        "多米尼加" -> "Dominica"
        "多米尼加共和国" -> "Dominican Republic"
        "东帝汶" -> "East Timor"
        "厄瓜多尔" -> "Ecuador"
        "埃及" -> "Egypt"
        "萨尔瓦多" -> "El Salvador"
        "赤道几内亚" -> "Equatorial Guinea"
        "厄立特里亚" -> "Eritrea"
        "爱沙尼亚" -> "Estonia"
        "埃塞俄比亚" -> "Ethiopia"
        "福克兰群岛" -> "Falkland Islands"
        "法罗群岛" -> "Faroe Islands"
        "斐济" -> "Fiji"
        "芬兰" -> "Finland"
        "法国" -> "France"
        "法属圭亚那" -> "French Guiana"
        "法属波利尼西亚" -> "French Polynesia"
        "加蓬" -> "Gabon"
        "冈比亚" -> "Gambia"
        "佐治亚州" -> "Georgia"
        "德国" -> "Germany"
        "加纳" -> "Ghana"
        "直布罗陀" -> "Gibraltar"
        "希腊" -> "Greece"
        "格陵兰岛" -> "Greenland"
        "格林纳达" -> "Grenada"
        "瓜德罗普岛" -> "Guadeloupe"
        "关岛（美）" -> "Guam"
        "危地马拉" -> "Guatemala"
        "根西岛（英）" -> "Guernsey"
        "几内亚" -> "Guinea"
        "几内亚比绍" -> "Guinea-Bissau"
        "圭亚那" -> "Guyana"
        "海地" -> "Haiti"
        "洪都拉斯" -> "Honduras"
        "香港" -> "Hong Kong"
        "匈牙利" -> "Hungary"
        "象牙海岸" -> "IVORY COAST"
        "冰岛" -> "Iceland"
        "印度" -> "India"
        "印度尼西亚" -> "Indonesia"
        "伊朗" -> "Iran"
        "伊拉克" -> "Iraq"
        "爱尔兰" -> "Ireland"
        "马恩岛（英）" -> "Isle of Man"
        "以色列" -> "Israel"
        "意大利" -> "Italy"
        "约旦" -> "JORDAN"
        "牙买加" -> "Jamaica"
        "日本" -> "Japan"
        "泽西（英）" -> "Jersey"
        "乔丹" -> "Jordan"
        "基里巴斯" -> "KIRIBATI"
        "韩国" -> "KOREA"
        "朝鲜" -> "KOREA（DPR OF）"
        "哈萨克斯坦" -> "Kazakhstan"
        "肯尼亚" -> "Kenya"
        "科索沃" -> "Kosovo"
        "科威特" -> "Kuwait"
        "吉尔吉斯斯坦" -> "Kyrgyzstan"
        "老挝" -> "Laos"
        "拉脱维亚" -> "Latvia"
        "黎巴嫩" -> "Lebanon"
        "莱索托" -> "Lesotho"
        "利比里亚" -> "Liberia"
        "利比亚" -> "Libya"
        "列支敦士登" -> "Liechtenstein"
        "立陶宛" -> "Lithuania"
        "卢森堡" -> "Luxembourg"
        "马里亚纳群岛" -> "MARIANA Islands"
        "马提尼克岛" -> "MARSHALL Islands"
        "密克罗尼西亚" -> "MICRONESIA"
        "澳门" -> "Macau"
        "马其顿" -> "Macedonia"
        "马达加斯加" -> "Madagascar"
        "马拉维" -> "Malawi"
        "马来西亚" -> "Malaysia"
        "马尔代夫" -> "Maldives"
        "马里" -> "Mali"
        "马耳他" -> "Malta"
        "马提尼克" -> "Martinique"
        "毛里塔尼亚" -> "Mauritania"
        "毛里求斯" -> "Mauritius"
        "马约特岛" -> "Mayotte"
        "墨西哥" -> "Mexico"
        "摩尔多瓦" -> "Moldova"
        "摩纳哥" -> "Monaco"
        "蒙古" -> "Mongolia"
        "黑山" -> "Montenegro"
        "蒙特塞拉特岛（英）" -> "Montserrat"
        "摩洛哥" -> "Morocco"
        "莫桑比克" -> "Mozambique"
        "缅甸" -> "Myanmar"
        "纽埃岛" -> "NIUE Islands"
        "纳米比亚" -> "Namibia"
        "瑙鲁" -> "Nauru"
        "尼泊尔" -> "Nepal"
        "荷兰" -> "Netherlands"
        "安的列斯群岛（荷）" -> "Netherlands Antilles"
        "新喀里多尼亚" -> "New Caledonia"
        "新西兰" -> "New Zealand"
        "尼加拉瓜" -> "Nicaragua"
        "尼日尔" -> "Niger"
        "尼日利亚" -> "Nigeria"
        "诺福克岛" -> "Norfolk Island"
        "北马里亚纳群岛" -> "Northern Mariana Islands"
        "挪威" -> "Norway"
        "阿曼" -> "Oman"
        "巴基斯坦" -> "Pakistan"
        "帕劳" -> "Palau"
        "巴勒斯坦" -> "Palestine"
        "巴拿马" -> "Panama"
        "巴布亚新几内亚" -> "Papua New Guinea"
        "巴拉圭" -> "Paraguay"
        "秘鲁" -> "Peru"
        "菲律宾" -> "Philippines"
        "波兰" -> "Poland"
        "葡萄牙" -> "Portugal"
        "波多黎各（美）" -> "Puerto Rico"
        "卡塔尔" -> "Qatar"
        "留尼汪岛" -> "Reunion"
        "罗马尼亚" -> "Romania"
        "俄罗斯" -> "Russia"
        "卢旺达" -> "Rwanda"
        "所罗门群岛" -> "SOLOMON Islands"
        "斯威士兰" -> "SWAZILAND"
        "萨摩亚.东部" -> "Samoa.eastern"
        "萨摩亚.西部" -> "Samoa.western"
        "圣马力诺" -> "San Marino"
        "圣多美和普林西比" -> "Sao Tome and Principe"
        "沙特阿拉伯" -> "Saudi Arabia"
        "塞内加尔" -> "Senegal"
        "塞尔维亚" -> "Serbia"
        "塞舌尔" -> "Seychelles"
        "塞拉利昂" -> "Sierra Leone"
        "新加坡" -> "Singapore"
        "斯洛伐克" -> "Slovakia"
        "斯洛文尼亚" -> "Slovenia"
        "索马里" -> "Somalia"
        "南非" -> "South Africa"
        "南苏丹" -> "South Sudan"
        "西班牙" -> "Spain"
        "斯里兰卡" -> "Sri Lanka"
        "尼维斯" -> "St.Kitts and Nevis"
        "圣卢西亚" -> "St.Lucia"
        "圣皮埃尔和密克隆" -> "St.Pierre and Miquelon"
        "圣文森特和格林纳丁斯" -> "St.Vincent and Grenadines"
        "苏丹" -> "Sudan"
        "苏里南" -> "Suriname"
        "瑞典" -> "Sweden"
        "瑞士" -> "Switzerland"
        "叙利亚" -> "Syria"
        "托克劳岛" -> "TOKELAU Island"
        "土库曼斯坦" -> "TURKMENISTAN"
        "图瓦卢" -> "TUVALU"
        "台湾" -> "Taiwan"
        "塔吉克斯坦" -> "Tajikistan"
        "坦桑尼亚" -> "Tanzania"
        "泰国" -> "Thailand"
        "多哥" -> "Togo"
        "汤加" -> "Tonga"
        "特立尼达和多巴哥" -> "Trinidad and Tobago"
        "突尼斯" -> "Tunisia"
        "土耳其" -> "Turkey"
        "特克斯和凯科斯群岛" -> "Turks and Caicos Islands"
        "乌干达" -> "Uganda"
        "乌克兰" -> "Ukraine"
        "阿拉伯联合酋长国/迪拜" -> "United Arab Emirates"
        "英国" -> "United Kingdom"
        "美国" -> "United States"
        "乌拉圭" -> "Uruguay"
        "乌兹别克斯坦" -> "Uzbekistan"
        "瓦努阿图" -> "Vanuatu"
        "委内瑞拉" -> "Venezuela"
        "越南" -> "Vietnam"
        "维尔京群岛（英）" -> "Virgin Islands British"
        "维尔京群岛（美）" -> "Virgin Islands U.S."
        "墙壁瓦利斯群岛和富图纳群岛" -> "WALLS AND FUTUNA"
        "南斯拉夫" -> "YUGOSLAVIA"
        "也门" -> "Yemen"
        "桑给巴尔岛" -> "ZANZIBAR"
        "赞比亚" -> "Zambia"
        "津巴布韦" -> "Zimbabwe"
        else -> name
    }

    fun parseChainName(name: String) = when (name) {
        "China" -> "中国"
        "Afghanistan" -> "阿富汗"
        "Albania" -> "阿尔巴尼亚"
        "Algeria" -> "阿尔及利亚"
        "American Samoa" -> "美国萨摩亚"
        "Andorra" -> "安道尔"
        "Angola" -> "安哥拉"
        "Anguilla" -> "安圭拉（英）"
        "Antigua and Barbuda" -> "安提瓜和巴布达"
        "Argentina" -> "阿根廷"
        "Armenia" -> "亚美尼亚"
        "Aruba" -> "阿鲁巴"
        "Australia" -> "澳大利亚"
        "Austria" -> "奥地利"
        "Azerbaijan" -> "阿塞拜疆"
        "BELIZE" -> "伯利兹"
        "Bahamas" -> "巴哈马"
        "Bahrain" -> "巴林"
        "Bangladesh" -> "孟加拉国"
        "Barbados" -> "巴巴多斯"
        "Belarus" -> "白俄罗斯"
        "Belgium" -> "比利时"
        "Benin" -> "贝宁"
        "Bermuda" -> "百慕大群岛（英）"
        "Bhutan" -> "不丹"
        "Bolivia" -> "玻利维亚"
        "Bosnia and Herzegovina" -> "波斯尼亚和黑塞哥维那"
        "Botswana" -> "博茨瓦纳"
        "Brazil" -> "巴西"
        "Brunei" -> "文莱"
        "Bulgaria" -> "保加利亚"
        "Burkina Faso" -> "布基纳法索"
        "Burundi" -> "布隆迪"
        "Cambodia" -> "柬埔寨"
        "Cameroon" -> "喀麦隆"
        "Canada" -> "加拿大"
        "Cape Verde" -> "佛得角"
        "Cayman Islands" -> "开曼群岛（英）"
        "Central African Republic" -> "中非共和国"
        "Chad" -> "乍得"
        "Chile" -> "智利"
        "Colombia" -> "哥伦比亚"
        "Comoros" -> "科摩罗"
        "Congo" -> "刚果"
        "Congo D.R." -> "刚果金"
        "Cook Islands" -> "库克群岛"
        "Costa Rica" -> "哥斯达黎加"
        "Cote dIvoire" -> "科特迪瓦"
        "Croatia" -> "克罗地亚"
        "Cuba" -> "古巴"
        "Cyprus" -> "塞浦路斯"
        "Czech" -> "捷克"
        "Denmark" -> "丹麦"
        "Diego Garcia" -> "迭戈加西亚"
        "Djibouti" -> "吉布提"
        "Dominica" -> "多米尼加"
        "Dominican Republic" -> "多米尼加共和国"
        "East Timor" -> "东帝汶"
        "Ecuador" -> "厄瓜多尔"
        "Egypt" -> "埃及"
        "El Salvador" -> "萨尔瓦多"
        "Equatorial Guinea" -> "赤道几内亚"
        "Eritrea" -> "厄立特里亚"
        "Estonia" -> "爱沙尼亚"
        "Ethiopia" -> "埃塞俄比亚"
        "Falkland Islands" -> "福克兰群岛"
        "Faroe Islands" -> "法罗群岛"
        "Fiji" -> "斐济"
        "Finland" -> "芬兰"
        "France" -> "法国"
        "French Guiana" -> "法属圭亚那"
        "French Polynesia" -> "法属波利尼西亚"
        "Gabon" -> "加蓬"
        "Gambia" -> "冈比亚"
        "Georgia" -> "佐治亚州"
        "Germany" -> "德国"
        "Ghana" -> "加纳"
        "Gibraltar" -> "直布罗陀"
        "Greece" -> "希腊"
        "Greenland" -> "格陵兰岛"
        "Grenada" -> "格林纳达"
        "Guadeloupe" -> "瓜德罗普岛"
        "Guam" -> "关岛（美）"
        "Guatemala" -> "危地马拉"
        "Guernsey" -> "根西岛（英）"
        "Guinea" -> "几内亚"
        "Guinea-Bissau" -> "几内亚比绍"
        "Guyana" -> "圭亚那"
        "Haiti" -> "海地"
        "Honduras" -> "洪都拉斯"
        "Hong Kong" -> "香港"
        "Hungary" -> "匈牙利"
        "IVORY COAST" -> "象牙海岸"
        "Iceland" -> "冰岛"
        "India" -> "印度"
        "Indonesia" -> "印度尼西亚"
        "Iran" -> "伊朗"
        "Iraq" -> "伊拉克"
        "Ireland" -> "爱尔兰"
        "Isle of Man" -> "马恩岛（英）"
        "Israel" -> "以色列"
        "Italy" -> "意大利"
        "JORDAN" -> "约旦"
        "Jamaica" -> "牙买加"
        "Japan" -> "日本"
        "Jersey" -> "泽西（英）"
        "Jordan" -> "乔丹"
        "KIRIBATI" -> "基里巴斯"
        "KOREA" -> "韩国"
        "KOREA（DPR OF）" -> "朝鲜"
        "Kazakhstan" -> "哈萨克斯坦"
        "Kenya" -> "肯尼亚"
        "Kosovo" -> "科索沃"
        "Kuwait" -> "科威特"
        "Kyrgyzstan" -> "吉尔吉斯斯坦"
        "Laos" -> "老挝"
        "Latvia" -> "拉脱维亚"
        "Lebanon" -> "黎巴嫩"
        "Lesotho" -> "莱索托"
        "Liberia" -> "利比里亚"
        "Libya" -> "利比亚"
        "Liechtenstein" -> "列支敦士登"
        "Lithuania" -> "立陶宛"
        "Luxembourg" -> "卢森堡"
        "MARIANA Islands" -> "马里亚纳群岛"
        "MARSHALL Islands" -> "马提尼克岛"
        "MICRONESIA" -> "密克罗尼西亚"
        "Macau" -> "澳门"
        "Macedonia" -> "马其顿"
        "Madagascar" -> "马达加斯加"
        "Malawi" -> "马拉维"
        "Malaysia" -> "马来西亚"
        "Maldives" -> "马尔代夫"
        "Mali" -> "马里"
        "Malta" -> "马耳他"
        "Martinique" -> "马提尼克"
        "Mauritania" -> "毛里塔尼亚"
        "Mauritius" -> "毛里求斯"
        "Mayotte" -> "马约特岛"
        "Mexico" -> "墨西哥"
        "Moldova" -> "摩尔多瓦"
        "Monaco" -> "摩纳哥"
        "Mongolia" -> "蒙古"
        "Montenegro" -> "黑山"
        "Montserrat" -> "蒙特塞拉特岛（英）"
        "Morocco" -> "摩洛哥"
        "Mozambique" -> "莫桑比克"
        "Myanmar" -> "缅甸"
        "NIUE Islands" -> "纽埃岛"
        "Namibia" -> "纳米比亚"
        "Nauru" -> "瑙鲁"
        "Nepal" -> "尼泊尔"
        "Netherlands" -> "荷兰"
        "Netherlands Antilles" -> "安的列斯群岛（荷）"
        "New Caledonia" -> "新喀里多尼亚"
        "New Zealand" -> "新西兰"
        "Nicaragua" -> "尼加拉瓜"
        "Niger" -> "尼日尔"
        "Nigeria" -> "尼日利亚"
        "Norfolk Island" -> "诺福克岛"
        "Northern Mariana Islands" -> "北马里亚纳群岛"
        "Norway" -> "挪威"
        "Oman" -> "阿曼"
        "Pakistan" -> "巴基斯坦"
        "Palau" -> "帕劳"
        "Palestine" -> "巴勒斯坦"
        "Panama" -> "巴拿马"
        "Papua New Guinea" -> "巴布亚新几内亚"
        "Paraguay" -> "巴拉圭"
        "Peru" -> "秘鲁"
        "Philippines" -> "菲律宾"
        "Poland" -> "波兰"
        "Portugal" -> "葡萄牙"
        "Puerto Rico" -> "波多黎各（美）"
        "Qatar" -> "卡塔尔"
        "Reunion" -> "留尼汪岛"
        "Romania" -> "罗马尼亚"
        "Russia" -> "俄罗斯"
        "Rwanda" -> "卢旺达"
        "SOLOMON Islands" -> "所罗门群岛"
        "SWAZILAND" -> "斯威士兰"
        "Samoa.eastern" -> "萨摩亚.东部"
        "Samoa.western" -> "萨摩亚.西部"
        "San Marino" -> "圣马力诺"
        "Sao Tome and Principe" -> "圣多美和普林西比"
        "Saudi Arabia" -> "沙特阿拉伯"
        "Senegal" -> "塞内加尔"
        "Serbia" -> "塞尔维亚"
        "Seychelles" -> "塞舌尔"
        "Sierra Leone" -> "塞拉利昂"
        "Singapore" -> "新加坡"
        "Slovakia" -> "斯洛伐克"
        "Slovenia" -> "斯洛文尼亚"
        "Somalia" -> "索马里"
        "South Africa" -> "南非"
        "South Sudan" -> "南苏丹"
        "Spain" -> "西班牙"
        "Sri Lanka" -> "斯里兰卡"
        "St.Kitts and Nevis" -> "尼维斯"
        "St.Lucia" -> "圣卢西亚"
        "St.Pierre and Miquelon" -> "圣皮埃尔和密克隆"
        "St.Vincent and Grenadines" -> "圣文森特和格林纳丁斯"
        "Sudan" -> "苏丹"
        "Suriname" -> "苏里南"
        "Sweden" -> "瑞典"
        "Switzerland" -> "瑞士"
        "Syria" -> "叙利亚"
        "TOKELAU Island" -> "托克劳岛"
        "TURKMENISTAN" -> "土库曼斯坦"
        "TUVALU" -> "图瓦卢"
        "Taiwan" -> "台湾"
        "Tajikistan" -> "塔吉克斯坦"
        "Tanzania" -> "坦桑尼亚"
        "Thailand" -> "泰国"
        "Togo" -> "多哥"
        "Tonga" -> "汤加"
        "Trinidad and Tobago" -> "特立尼达和多巴哥"
        "Tunisia" -> "突尼斯"
        "Turkey" -> "土耳其"
        "Turks and Caicos Islands" -> "特克斯和凯科斯群岛"
        "Uganda" -> "乌干达"
        "Ukraine" -> "乌克兰"
        "United Arab Emirates" -> "阿拉伯联合酋长国/迪拜"
        "United Kingdom" -> "英国"
        "United States" -> "美国"
        "Uruguay" -> "乌拉圭"
        "Uzbekistan" -> "乌兹别克斯坦"
        "Vanuatu" -> "瓦努阿图"
        "Venezuela" -> "委内瑞拉"
        "Vietnam" -> "越南"
        "Virgin Islands British" -> "维尔京群岛（英）"
        "Virgin Islands U.S." -> "维尔京群岛（美）"
        "WALLS AND FUTUNA" -> "墙壁瓦利斯群岛和富图纳群岛"
        "YUGOSLAVIA" -> "南斯拉夫"
        "Yemen" -> "也门"
        "ZANZIBAR" -> "桑给巴尔岛"
        "Zambia" -> "赞比亚"
        "Zimbabwe" -> "津巴布韦"
        else -> name
    }

    fun k(s:String) = s.substring(s.lastIndexOf("/") + 1,s.lastIndexOf("."))

    fun j(s:String) = k(s).length == 8

    fun a(c: Activity, id: Int, a: String, b: String) {
        when (LocaleHelper.getLanguage(Utils.getContext())) {
            "zh", "TW" -> {
                (c.findViewById<View>(id) as TextView).text = a
            }
            else -> {
                (c.findViewById<View>(id) as TextView).text = b
            }
        }
    }

    fun b(a: String, b: String) = when (LocaleHelper.getLanguage(Utils.getContext())) {
        "zh", "TW" -> {
            a
        }
        else -> {
            b
        }
    }

    fun c(a: Int, b: Int) = when (LocaleHelper.getLanguage(Utils.getContext())) {
        "zh", "TW" -> {
            a
        }
        else -> {
            b
        }
    }

    fun d(c: View, id: Int, a: String, b: String) {
        when (LocaleHelper.getLanguage(Utils.getContext())) {
            "zh", "TW" -> {
                (c.findViewById<View>(id) as TextView).text = a
            }
            else -> {
                (c.findViewById<View>(id) as TextView).text = b
            }
        }
    }

    fun e(c: Activity, id: Int, a: String, b: String) {
        when (LocaleHelper.getLanguage(Utils.getContext())) {
            "zh", "TW" -> {
                (c.findViewById<View>(id) as TextView).hint = a
            }
            else -> {
                (c.findViewById<View>(id) as TextView).hint = b
            }
        }
    }

    fun f() = when (LocaleHelper.getLanguage(Utils.getContext())) {
        "zh", "TW" -> true
        else -> false
    }

    fun g(func:(Int)->Unit) = when (LocaleHelper.getLanguage(Utils.getContext())) {
        "zh", "TW" -> func.invoke(1)
        else -> func.invoke(2)
    }
}