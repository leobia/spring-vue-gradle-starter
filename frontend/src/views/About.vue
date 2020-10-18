<template>
  <div class="about">
    <h1>This is an page</h1>
  </div>
</template>

<script>
export default {
  mounted() {
    this.$http.get("/api/test").then(response => {
      console.log(response)
    }, response => {
      console.error(response)
    });
  }
};
</script>
