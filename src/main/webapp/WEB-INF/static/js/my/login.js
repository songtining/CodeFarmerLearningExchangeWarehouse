function toLogin() {
   $.ajax({
       type: "POST",
       url: "/user/checkUserName",
       data: {username:$("#username").val(), password:$("#password").val()},
       async:false,
       //dataType:json,
       success: function(data){
           console.log(data);
           var json=JSON.parse(data);
           if (json.flag){
               window.location.href = "/user/login";
           }else {
               alert(json.msg);
           }
       },
       error: function (xhr, status, p3, p4) {
            alert("系统出错啦!!!!")
       }
   })
}