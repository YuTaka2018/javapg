//クリックで反応させる
$(function(){
var total = "";

 $("#calc td").click(function(){
    var atai = $(this).text();
    var answer = "";

 console.log(atai);

//計算処理
    if(atai == "="){
      //iputの値を取る
      var keisan = $("#calc input[name=answer]").val();
      //*と/を使えるようにする
      keisan = keisan.replace(/×/g,"*");
      keisan = keisan.replace(/÷/g,"/");
      //計算した値を表示させる
      total = eval(keisan);
      $("#calc input[name=answer]").val(total);
      return;
    //一文字消す
    }else if(atai == "▶"){
     keisan = $("#calc input[name=answer]").val();
     keisan = keisan.substr(0,keisan.length-1);
     $("#calc input[name=answer]").val(keisan);
     total = keisan;
     return;
    //全て消す
    }else if(atai == "AC"){
      $("#calc input[name=answer]").val("");
      total = "";
      return;
    //値の入力
    }else{
      total += atai;
    }

//input部分に表示
    $("#calc input[name=answer]").val(total);

    if(atai == "="){
      total = "";
    }

});
});
