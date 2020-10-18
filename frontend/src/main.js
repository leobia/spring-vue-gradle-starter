import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import Axios from "axios";

const app = createApp(App)
  .use(router);
app.config.globalProperties.$http = Axios;
app.mount("#app");
