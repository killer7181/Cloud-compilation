<script>
export default {
  name: "EditText",
 data() {
    return {
      form:{
        project:'560H',
        customer:'',
        timezone:'America/New_York',
        language:'en-US',
        volume:'30',
        bootAging:'0',
        bootWizard:'1',
        bootTv:'-1',
        noSignalTime:'15',
        DDRSize:'D',
        EMMCSize:'B',
        remote:'HSAN12_key_m90',
        kaiNiss:'0',
        ykvoice:'0',
        keypad:'MDUSLRP',
        logo:'DEFAULT_LOGO',
        hide1:'NULL',
        hide2:'NULL',
        hide3:'NULL',
        password1:'NULL',
        password2:'NULL',
        password3:'NULL',
        bootOption:'bootanim',
        bootName:'bootanimation.zip',
        boardType:'815R00',
        config:'C00',
        CI:'0',
        dolby:'0',
        currentType:'E12',
        current:'',
        panel:'',
        pqIni:'DEFAULT',
        pqBin:'DEFAULT',
        aqIni:'8R10W',
        tvSystem:'0',
        wizardCountry:'0',
        epgLanguage:'eng',
        powerMode:'1',
        screenColor:'1',
        google:'1',
        home:'zeason',
        cast:'mircast',
        keyboard:'abroad',
        nikeWebJump:'0',
        sxHotel:'0',
        bcHotel:'0',
        preInstall:[],
        special:[],
        retail:'DEFAULT',
        saverTime:'2147483647'
      }
    }
 },
  methods:{
    onsubmit(){
      console.log(this.form)
    }
  }
}
</script>

<template>
  <div>
    <p>软件编译</p>
    <el-form :model="form" label-width="120px" >
      <el-form-item label="工程名" label-width="580">
      <el-select v-model="form.project" >
        <el-option label="560H" value="shanghai"></el-option>
        <el-option label="352E_32bit" value="beijing"></el-option>
      </el-select>
      </el-form-item>
      <el-form-item label="客户名" label-width="580" required>
        <el-input v-model="form.customer"  style="width: 215px;"></el-input>
      </el-form-item>
      <el-form-item label="时区" label-width="580" required>
        <el-select v-model="form.timezone" >
          <el-option label="中国" value="shanghai"></el-option>
          <el-option label="美国" value="America/New_York"></el-option>
        </el-select>
      </el-form-item>
    </el-form>
    <el-form-item label="语言" label-width="580" required>
      <el-select v-model="form.language" >
        <el-option label="英语" value="en-US"></el-option>
        <el-option label="简体中文" value="beijing"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="默认音量" label-width="580">
      <el-input v-model="form.volume" placeholder="30" style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="开机老化" label-width="580">
      <el-select v-model="form.bootAging" >
        <el-option label="进" value="1"></el-option>
        <el-option label="不进" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="开机向导" label-width="580">
      <el-select v-model="form.bootWizard" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="首次开机进入" label-width="580">
      <el-select v-model="form.bootTv" >
        <el-option label="主页" value="-1" ></el-option>
        <el-option label="ATV" value="0"></el-option>
        <el-option label="AV1" value="3"></el-option>
        <el-option label="AV2" value="4"></el-option>
        <el-option label="HDMI1" value="9"></el-option>
        <el-option label="HDMI2" value="10"></el-option>
        <el-option label="DTMB" value="18"></el-option>
        <el-option label="ISDB" value="21"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="无信号待机" label-width="580">
      <el-select v-model="form.noSignalTime" >
        <el-option label="关闭" value="0" ></el-option>
        <el-option label="15分钟" value="15"></el-option>
        <el-option label="1分钟" value="1"></el-option>
        <el-option label="3分钟" value="3"></el-option>
        <el-option label="5分钟" value="5"></el-option>
        <el-option label="10分钟" value="10"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="DDR大小" label-width="580" required>
      <el-select v-model="form.DDRSize" >
        <el-option label="1G" value="C" ></el-option>
        <el-option label="1.5G" value="D"></el-option>
        <el-option label="2G" value="E"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="EMMC大小" label-width="580" required>
      <el-select v-model="form.EMMCSize" >
        <el-option label="8G" value="B" ></el-option>
        <el-option label="16G" value="C"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="遥控" label-width="580" required>
      <el-input v-model="form.remote"  style="width: 215px;" placeholder="HSAN12_key_m90"></el-input>
    </el-form-item>
    <el-form-item label="谷歌语音" label-width="580">
      <el-select v-model="form.kaiNiss" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="优酷语音" label-width="580">
      <el-select v-model="form.ykvoice" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="按键板" label-width="580" required>
      <el-select v-model="form.keypad" >
        <el-option label="MDUSLRP" value="MDUSLRP" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="LOGO" label-width="580" required>
      <el-select v-model="form.logo" >
        <el-option label="DEFAULT_LOGO" value="DEFAULT_LOGO" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="隐藏Logo1" label-width="580" >
      <el-input v-model="form.hide1"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="隐藏Logo2" label-width="580" >
      <el-input v-model="form.hide2"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="隐藏Logo3" label-width="580" >
      <el-input v-model="form.hide3"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="隐藏Logo1密码" label-width="580" >
      <el-input v-model="form.password1"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="隐藏Logo2密码" label-width="580" >
      <el-input v-model="form.password2"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="隐藏Logo3密码" label-width="580" >
      <el-input v-model="form.password3"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="开机动画或视频" label-width="580" >
      <el-select v-model="form.bootOption" >
        <el-option label="动画" value="bootanim" ></el-option>
        <el-option label="视频" value="bootvideo" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="动画或视频名" label-width="580" >
      <el-input v-model="form.bootName"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="版型" label-width="580" required>
      <el-select v-model="form.boardType" >
        <el-option label="815R00" value="815R00" ></el-option>
        <el-option label="818R00" value="818R00" ></el-option>
        <el-option label="A01R00" value="A01R00" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="配置" label-width="580" required>
      <el-select v-model="form.config">
        <el-option label="C00" value="C00" ></el-option>
        <el-option label="C02" value="C02" ></el-option>
        <el-option label="C03" value="C03" ></el-option>
        <el-option label="C06" value="C06" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="CI卡" label-width="580">
      <el-select v-model="form.CI" >
        <el-option label="带" value="1" ></el-option>
        <el-option label="不带" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="杜比" label-width="580">
      <el-select v-model="form.dolby" >
        <el-option label="带" value="1" ></el-option>
        <el-option label="不带" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="电流规格" label-width="580" required>
      <el-select v-model="form.currentType">
        <el-option label="E12" value="E12" ></el-option>
        <el-option label="E16" value="E16" ></el-option>
        <el-option label="E312" value="E312" ></el-option>
        <el-option label="E316" value="E316" ></el-option>
        <el-option label="D06" value="D06" ></el-option>
        <el-option label="D08" value="D08" ></el-option>
        <el-option label="B06" value="B06" ></el-option>
        <el-option label="A01" value="A01" ></el-option>
        <el-option label="D10A" value="D10A" ></el-option>
        <el-option label="D07" value="D07" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="电流" label-width="580" required>
      <el-input v-model="form.current"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="屏参" label-width="580" required>
      <el-input v-model="form.panel"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="PQ_INI" label-width="580">
      <el-select v-model="form.pqIni" >
        <el-option label="DEFAULT" value="DEFAULT" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="PQ_BNI" label-width="580">
      <el-select v-model="form.pqBin" >
        <el-option label="DEFAULT" value="DEFAULT" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="AQ_BNI" label-width="580">
      <el-select v-model="form.aqIni" >
        <el-option label="8R10W" value="8R10W" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="电视制式" label-width="580" required>
      <el-select v-model="form.tvSystem">
        <el-option label="PAL" value="0" ></el-option>
        <el-option label="DTMB_DVBC" value="1" ></el-option>
        <el-option label="ATSC" value="2" ></el-option>
        <el-option label="ISDBT" value="3" ></el-option>
        <el-option label="NTSC" value="3_1" ></el-option>
        <el-option label="DVBT_T2_C" value="4" ></el-option>
        <el-option label="DVBT_T2_S_S2_C" value="5" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="向导国家" label-width="580" required>
      <el-input v-model="form.wizardCountry"  style="width: 215px;"></el-input>
    </el-form-item>
    <el-form-item label="EPG语言" label-width="580" required>
      <el-select v-model="form.epgLanguage">
        <el-option label="英语" value="eng" ></el-option>
        <el-option label="中文" value="chs" ></el-option>
        <el-option label="西班牙语" value="spa" ></el-option>
        <el-option label="葡萄牙语" value="por" ></el-option>
        <el-option label="越南语" value="vie" ></el-option>
        <el-option label="阿拉伯语" value="ara" ></el-option>
        <el-option label="德语" value="ger" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="上电模式" label-width="580">
      <el-select v-model="form.powerMode" >
        <el-option label="上电开机" value="0" ></el-option>
        <el-option label="上电待机" value="1"></el-option>
        <el-option label="记忆开机前状态" value="2"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="无信号颜色" label-width="580">
      <el-select v-model="form.screenColor" >
        <el-option label="黑屏" value="0" ></el-option>
        <el-option label="蓝屏" value="1"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="谷歌框架" label-width="580">
      <el-select v-model="form.google" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="主页" label-width="580" required>
      <el-select v-model="form.home">
        <el-option label="智象" value="zeason" ></el-option>
        <el-option label="智象尼科" value="zeason_nike" ></el-option>
        <el-option label="智象安徽海洋" value="zeason_ahhy" ></el-option>
        <el-option label="智象安普瑞尔" value="zeason_apre" ></el-option>
        <el-option label="智象俄罗斯" value="zeason_ru" ></el-option>
        <el-option label="智象印度" value="zeason_in" ></el-option>
        <el-option label="金盾" value="jindun" ></el-option>
        <el-option label="当贝" value="dangbei" ></el-option>
        <el-option label="国外极简" value="abroad" ></el-option>
        <el-option label="国内极简" value="china" ></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="投屏" label-width="580" required>
      <el-select v-model="form.cast" >
        <el-option label="仅Mircast" value="mircast" ></el-option>
        <el-option label="加eshare" value="eshare"></el-option>
        <el-option label="加whaleplay" value="whaleplay"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="键盘" label-width="580" required>
      <el-select v-model="form.keyboard" >
        <el-option label="国内" value="china" ></el-option>
        <el-option label="国外" value="abroad"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="尼科跳转网页" label-width="580">
      <el-select v-model="form.nikeWebJump" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="视显酒店应用" label-width="580">
      <el-select v-model="form.sxHotel" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="铂彩酒店应用" label-width="580">
      <el-select v-model="form.bcHotel" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="预装应用" label-width="100">
      <el-checkbox-group v-model="form.preInstall" style="width: 80%">
        <el-checkbox label="youtube" name="youtube"></el-checkbox>
        <el-checkbox label="facebook" name="facebook"></el-checkbox>
        <el-checkbox label="amazon" name="amazon"></el-checkbox>
        <el-checkbox label="twitter" name="twitter"></el-checkbox>
        <el-checkbox label="vtvgotv" name="vtvgotv"></el-checkbox>
        <el-checkbox label="vtvcabon" name="vtvcabon"></el-checkbox>
        <el-checkbox label="ggyy" name="ggyy"></el-checkbox>
        <el-checkbox label="dbsc" name="dbsc"></el-checkbox>
        <el-checkbox label="dsj" name="dsj"></el-checkbox>
        <el-checkbox label="zzsa" name="zzsa"></el-checkbox>
        <el-checkbox label="zzsaTV" name="zzsaTV"></el-checkbox>
        <el-checkbox label="yandex" name="yandex"></el-checkbox>
        <el-checkbox label="moreTV" name="moreTV"></el-checkbox>
        <el-checkbox label="start" name="start"></el-checkbox>
        <el-checkbox label="premier" name="premier"></el-checkbox>
        <el-checkbox label="hbo" name="hbo"></el-checkbox>
        <el-checkbox label="disney" name="disney"></el-checkbox>
        <el-checkbox label="awstv" name="awstv"></el-checkbox>
        <el-checkbox label="iptv" name="iptv"></el-checkbox>
        <el-checkbox label="cinemana" name="cinemana"></el-checkbox>
        <el-checkbox label="shabaktv" name="shabaktv"></el-checkbox>
        <el-checkbox label="shahid" name="shahid"></el-checkbox>
        <el-checkbox label="hstv" name="hstv"></el-checkbox>
        <el-checkbox label="tivimeta" name="tivimeta"></el-checkbox>
        <el-checkbox label="xxfbxt" name="xxfbxt"></el-checkbox>
        <el-checkbox label="airscreen" name="airscreen"></el-checkbox>
        <el-checkbox label="mixue" name="mixue"></el-checkbox>
        <el-checkbox label="lebocast" name="lebocast"></el-checkbox>
        <el-checkbox label="wink" name="wink"></el-checkbox>
        <el-checkbox label="lvl" name="lvl"></el-checkbox>
        <el-checkbox label="okvideo" name="okvideo"></el-checkbox>
        <el-checkbox label="fedraltv" name="fedraltv"></el-checkbox>
        <el-checkbox label="kinoposik" name="kinoposik"></el-checkbox>
        <el-checkbox label="smotrim" name="smotrim"></el-checkbox>
        <el-checkbox label="hxbc" name="hxbc"></el-checkbox>
      </el-checkbox-group>
    </el-form-item>
    <el-form-item label="特殊配置" label-width="100">
      <el-checkbox-group v-model="form.special">
        <el-checkbox label="special1">HDMI名字改成HD INPUT</el-checkbox>
        <el-checkbox label="special2">主页可按source键</el-checkbox>
        <el-checkbox label="special3">按键板菜单</el-checkbox>
        <el-checkbox label="special4">不显示内存信息和存储空间</el-checkbox>
        <el-checkbox label="special5">显示安卓13</el-checkbox>
        <el-checkbox label="special6" name="special6">HDMI显示哪路是带ARC功能</el-checkbox>
        <el-checkbox label="special7">UI修改成1080P分辨率</el-checkbox>
        <el-checkbox label="special8">扩大300Msystem分区空间</el-checkbox>
        <el-checkbox label="special9">内存虚标成1.5G</el-checkbox>
        <el-checkbox label="special10">尼科panelinfo显示3840*2160(4K) panel QLED</el-checkbox>
        <el-checkbox label="special11">尼科投屏名字改成FAMILY TV</el-checkbox>
        <el-checkbox label="special12">尼科DTV改成DVB-T2</el-checkbox>
        <el-checkbox label="special13">尼科MEDIA改成USB</el-checkbox>
        <el-checkbox label="special14">尼科泰国屏蔽DVBC</el-checkbox>
        <el-checkbox label="special15">DTV和ATV顺序交换</el-checkbox>
        <el-checkbox label="special16">CEC下MENU CONTROL默认关闭</el-checkbox>
        <el-checkbox label="special17">尼科,通道8秒无操作直接进入选中通道</el-checkbox>
        <el-checkbox label="special18">尼科,HDMI4下，按4次HOME键才能返回主页,屏蔽返回键,不显示Info信息</el-checkbox>
        <el-checkbox label="special19">HDMI4改为SMART TV</el-checkbox>
        <el-checkbox label="special20">针对560-818R00C04的HDMI顺序反转</el-checkbox>
        <el-checkbox label="special21">尼科panelinfo显示3840*2160(4K) panel</el-checkbox>
        <el-checkbox label="special22">酒店模式密码更换为1001</el-checkbox>
        <el-checkbox label="special23">亚美尼亚语放在语言列表首位</el-checkbox>
        <el-checkbox label="special24">开放卖场模式功能</el-checkbox>
        <el-checkbox label="special25">语言列表第一英语,第二马来语顺序</el-checkbox>
        <el-checkbox label="special26">龙啸电子无信号图片轮播</el-checkbox>
        <el-checkbox label="special27">把通道设置为主页</el-checkbox>
        <el-checkbox label="special28">CVBS名字换成AV</el-checkbox>
        <el-checkbox label="special29">多媒体断电播放弹提示</el-checkbox>
        <el-checkbox label="special30">珠海金品需要汇总:屏蔽finetune scan,屏蔽favorite list,通道菜单MENU返回BACK退出</el-checkbox>
        <el-checkbox label="special31">密码菜单3369切换正倒装(MIRROR),菜单2258切换屏参(VESA/JIEDA),菜单4477切换SWAP(ODD/EVEN)</el-checkbox>
        <el-checkbox label="special32">屏蔽tv</el-checkbox>
        <el-checkbox  label="special33">显示安卓11</el-checkbox>
        <el-checkbox  label="special34">显示2G+16G</el-checkbox>
        <el-checkbox  label="special35">屏蔽HDMI4</el-checkbox>
        <el-checkbox  label="special36">设备名称mde in malaysia,安卓15,3+32G</el-checkbox>
        <el-checkbox  label="special37">缩放只保留16:9,4:3,zoom1,zoom2,自动</el-checkbox>
        <el-checkbox  label="special38">设置关于添加显示1920X1080@120HZ</el-checkbox>
        <el-checkbox  label="special39">古巴通道蓝色键改为刻录，古巴预置频点</el-checkbox>
        <el-checkbox  label="special40">ISDB名字改为DTV</el-checkbox>
      </el-checkbox-group>
    </el-form-item>
    <el-form-item label="卖场模式" label-width="580" required>
      <el-select v-model="form.retail" >
        <el-option label="默认卖场模式" value="DEFAULT" ></el-option>
        <el-option label="无logo电子帖" value="LONGXIAO"></el-option>
        <el-option label="LG logo电子帖" value="LONGXIAO_LG"></el-option>
        <el-option label="SAMASUNG logo电子贴" value="LONGXIAO_SX"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="屏保时间" label-width="580" required>
      <el-select v-model="form.saverTime" >
        <el-option label="关闭" value="2147483647" ></el-option>
        <el-option label="五分钟" value="300000"></el-option>
        <el-option label="15分钟" value="900000"></el-option>
        <el-option label="30分钟" value="1800000"></el-option>
        <el-option label="1小时" value="3600000"></el-option>
        <el-option label="2小时" value="7200000"></el-option>
      </el-select>
    </el-form-item>
    <el-button type="primary" @click="onsubmit">提交</el-button>
  </div>
</template>

<style scoped>

</style>