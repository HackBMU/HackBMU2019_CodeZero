var express = require('express');
var app = express();
var path = require('path');
var server = require('http').createServer(app);
var io = require('socket.io')(server);
var port = process.env.PORT || 4200;
    dummyLoc={latitude:28.5246,longitude: 77.2066};//lat & lon of SAKET to set as default

server.listen(port, () => {
  console.log('Server listening at port %d', port);
});

console.log(__dirname);
var users = {};
var amb = {};

app.get('*',(req,res)=>{
      res.sendFile('../Angular/RedPlus/dist');
});

var userLoc=dummyLoc,ambLoc=dummyLoc;

io.on('connection', function(socket) {
          console.log('Connection made with the browser...' + socket.id);

        //connecting & sharing location of user
          socket.on('getUserLoc', function(data) {
            console.log('Hey Received User location');
            console.log('The lat&lon are ' + data.start + ' and ' + data.end);
          socket.broadcast.emit('GiveUserloctoAmb',data);
            console.log('The user location got sent!!');


          });


        //connecting & sharing location of Ambulance
        socket.on('getAmbLoc', function(data) {
          console.log('Hey Received Ambulance location');
          console.log('The places are ' + data.start + ' and ' + data.end);
        socket.broadcast.emit('GiveAmbloctouser',data);
console.log('The Ambulance location got sent!!');          });
});
    
function distanceTime ( wayPoint1, wayPoint2, time)
{
var Api="http://dev.virtualearth.net/REST/v1/Routes?wayPoint.1="+wayPoint1+"&waypoint.2="+wayPoint2+"2&optimize=timeWithTraffic&timeType=Arrival&dateTime="+time+
"&distanceUnit=km&key=ArA1Ia_YMBny3C67AvN0bx4K3ZnJ7wB4Fr4LF1H8jPxqHbnx1RRFsfeUoHMN9Wcq";
app.get(Api,(dara)=>{
console.log(dara);
});



}
distanceTime("Gurgaon","Delhi","22:31:00");


