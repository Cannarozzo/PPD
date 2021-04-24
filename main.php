<?php
$n = 1 << readline();

$primos = 0;
$primosEspeciais = 0;
$crivo = [];

for($i = 0; $i < $n; $i++){
    $crivo[$i] = TRUE;
}

for($i = 2; $i < $n; $i++){
    if($crivo[$i] === TRUE){
        $primos = $primos + 1;
        if($i % 4 != 3){
            $primosEspeciais = $primosEspeciais + 1;
        }
        for($j = $i*2; $j < $n; $j += $i){
            $crivo[$j] = FALSE;
        }
    }
}
echo $primos . " " . $primosEspeciais;

?>