//��д����ʵ��3���ַ������ӵĹ���,�������ɵ����ַ������׵�ַ��Ϊ��������ֵ.��д������main()���Ӽ������벻ͬ�ַ����Ժ������в��ԡ�
#include <iostream>
#include <string>
using namespace std;
string add(string s1,string s2,string s3){
    return s1+s2+s3;
}
int main(){
    string s1,s2,s3;

    cin>>s1;
    cin>>s2;
    cin>>s3;

    cout<<add(s1,s2,s3)<<endl;
    return 0;
}
