# Heterogeneous Parallel Programming

## Protability and Scalability in Heterogeneous Parallel Computing

### Scalability
- The same application runs efficiently on a new generation of cores
- The same application runs efficiently on more of the same cores

#### Performance growth with HW generations
- number of compute units
- number of threads
- vector length
- pipeline depth
- DRAM burst size
- DRAM channels
- data movement lantency

### Portability
- The same application runs efficiently on different types of cores
- The same application runs efficiently on systems with different organizaitons an interfaces

### HW types
- X86 vs. ARM, etc.
- Lantency oriented CPUs vs. throughput oriented GPUS
- VLIW vs. SIMD vs. threading
- shared memory vs. distributed memory

### Introduction to CUDA, DATA Parallelism and Threads

#### CUDA/OpenCL - Execution Model
- Serial parts in host C code
- Parallel parts in device SPMD kernel C code






