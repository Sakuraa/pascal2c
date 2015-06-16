program babelki;
uses crt;
var
tablica: array[1..10] of integer;
i,j,temp:integer;
begin
randomize;

for i:=1 to 10 do
begin
tablica[i]:=random(100);
write(tablica[i]:5);
end;

for i:=1 to 10-1 do
begin
for j:=1 to 10-i do
    begin
    if (tablica[j]>tablica[j+1]) then
       begin
       temp:=tablica[j];
       tablica[j]:=tablica[j+1];
       tablica[j+1]:=temp;
       end;
    end;
end;
writeln;
for i:=1 to 10 do
write(tablica[i]:5);
readkey;
end.

