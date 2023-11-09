<script>
export default {
  name: "EditText",
 data() {
    return {
      form:{
        bootAging:'0',
        bootWizard:'1',
      }
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
      <el-form-item label="客户名" label-width="580">
        <el-input v-model="form.costomer" placeholder="30" style="width: 215px;"></el-input>
      </el-form-item>
      <el-form-item label="时区" label-width="580">
        <el-select v-model="form.timezone" >
          <el-option label="中国" value="shanghai"></el-option>
          <el-option label="美国" value="beijing"></el-option>
        </el-select>
      </el-form-item>
    </el-form>
    <el-form-item label="语言" label-width="580">
      <el-select v-model="form.language" >
        <el-option label="英语" value="shanghai"></el-option>
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
    <el-form-item label="" label-width="580">
      <el-select v-model="form.bootWizard" >
        <el-option label="要" value="1" ></el-option>
        <el-option label="不要" value="0"></el-option>
      </el-select>
    </el-form-item>
  </div>
</template>

<style scoped>

</style>