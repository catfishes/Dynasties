//指定js名称
var login = this;

function onLaod(){
    var zh = $(":input[id='userZh']").val();
    var mm = $(":input[id='userMm']").val();
    if(zh == ""){
        // $(":input[id='userZh']").focus();
        $(":input[id='userZh']").val("请输入登陆名");
    }
    // if(mm==""){
    //     $(":input[id='userMm']").val("请输入认证密码");
    // }
}

//登陆
function onLogin() {

}

//重置
function onRest() {
    document.getElementById("userZh").value = "";
    document.getElementById("userMm").value = "";
}

function onClear() {
    var zh = document.getElementById("userZh").value;
    if("请输入登陆名"==zh){
        document.getElementById("userZh").value = "";
    }
}
