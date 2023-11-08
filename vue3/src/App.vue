<template>
<!--  <HelloWorld msg="Welcome to Your Vue.js App"/>-->
  <EditText/>
</template>

<script>
import EditText from "@/components/EditText.vue"
export default {
  name: 'App',
  components: {
    EditText
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
