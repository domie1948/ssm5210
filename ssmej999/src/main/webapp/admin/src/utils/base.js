const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmej999/",
            name: "ssmej999",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmej999/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "古玩玉器交易系统"
        } 
    }
}
export default base
