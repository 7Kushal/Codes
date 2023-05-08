#include <iostream>
using namespace std;

void pbr(int num){
    cout << num << endl;
    num+=5;
    cout<< num << "\n";
    // return 0;
}

int main() {
    // Write C++ code here
    int num ;
    cin >> num ;
    pbr(num);
    cout << num ;

    return 0;
}