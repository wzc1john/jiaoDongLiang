
window.onload = function () {
        // 1. 获取两个大小div
        var oPanel = document.getElementById('panel');
        // 定义4个变量
        // var disX = 0;//鼠标按下时光标的X值
        var disY = 0;//鼠标按下时光标的Y值
        // var disW = 0; //拖拽前div的宽
        var disH = 0; // 拖拽前div的高

        //3. 给oPanel加点击事件
        oPanel.onmousedown = function (ev) {
            var ev = ev || window.event;
            disX = ev.clientX; // 获取鼠标按下时光标x的值
            disY = ev.clientY; // 获取鼠标按下时光标Y的值
            disW = oPanel.offsetWidth; // 获取拖拽前div的宽
            disH = oPanel.offsetHeight; // 获取拖拽前div的高

            document.onmousemove = function (ev) {
                var ev = ev || window.event;
                //拖拽时为了对宽和高 限制一下范围，定义两个变量
                // var W =  ev.clientX - disX + disW;
                var H =  disY-ev.clientY  + disH;
                if(H<50){
                    H = 50;
                }
                if(H>400){
                    H = 400;
                }
                var h=H*0.04+'m';
                document.getElementById('box').innerHTML = "高度是"+h;
                // oPanel.style.width =W +'px';// 拖拽后物体的宽
                oPanel.style.height = H +'px';// 拖拽后物体的高

            }
            document.onmouseup = function () {
                document.onmousemove = null;
                document.onmouseup = null;
            }
        }

    }