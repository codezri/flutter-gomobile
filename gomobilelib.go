package gomobilelib

import "math/rand"

type (
    GoMobileLib struct {}
)

func (p *GoMobileLib) RandomNumber() int {
    return rand.Intn(100);
}
