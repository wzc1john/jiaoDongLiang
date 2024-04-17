
//y1 = Acos(wt-kx) k=2*pi/波长
//y2 = Acos(wt+kx)

//合成波： y= y1 + y2 = 2Acos(kx)cos(wt)

let points = new Array();
let t = 1;
let inct = Math.PI/130;

function setup(){

    createCanvas(100,400);
    // background(255, 204, 100);
    for(let i=0;i<1500;i++){
        points.push({
            x:i,
            // y:200+100*Math.sin(i*(Math.PI/400)) //200是偏移,100是放大倍数
            y:200+f(25,Math.PI,t,(Math.PI/13),i)
        });
    }
}

function draw(){
    t += inct;
    // fill(0);
    background(255);
    for(let k=0;k<1500;k++){
        points[k].y = 200+f(25,Math.PI,t,(Math.PI/13),k) //纵坐标随t在变化
        if(k!=0){
            line(points[k-1].x,points[k-1].y,points[k].x,points[k].y)  
        }
    }
}

//驻波公式
function f(A,w,t,k,x){
    //25,PI,t,PI/13
    return 2*A*Math.cos(w*t)*Math.cos(k*x)
}