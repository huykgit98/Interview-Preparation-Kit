'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the jumpingOnClouds function below.
function jumpingOnClouds(c) {
    if(c[2]==0){
        return 1 + jumpingOnClouds(c.slice(2));
    }else if(c[1]==0){
        return 1 + jumpingOnClouds(c.slice(1));
    }else{
        return 0;
    }
    //using Java
    // int result = -1;
    // for (int i = 0; i < arr.length; i++)
    // {
    //     if (i < arr.length - 2 && arr[i + 2] == 0)
    //     {
    //         i++;
    //     }
    //     result++;
    // }
    // return result;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const c = readLine().split(' ').map(cTemp => parseInt(cTemp, 10));

    let result = jumpingOnClouds(c);

    ws.write(result + "\n");

    ws.end();
}
